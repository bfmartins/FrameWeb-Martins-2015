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
 *   <li>{@link frameweb.impl.PageDependencyImpl#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link frameweb.impl.PageDependencyImpl#getSourceTemplate <em>Source Template</em>}</li>
 *   <li>{@link frameweb.impl.PageDependencyImpl#getLinkHTML <em>Link HTML</em>}</li>
 *   <li>{@link frameweb.impl.PageDependencyImpl#getSourcePage <em>Source Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageDependencyImpl extends NavigationDependencyImpl implements PageDependency {
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
	public Page getTargetPage() {
		if (targetPage != null && targetPage.eIsProxy()) {
			InternalEObject oldTargetPage = (InternalEObject)targetPage;
			targetPage = (Page)eResolveProxy(oldTargetPage);
			if (targetPage != oldTargetPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.PAGE_DEPENDENCY__TARGET_PAGE, oldTargetPage, targetPage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.PAGE_DEPENDENCY__TARGET_PAGE, oldTargetPage, targetPage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.PAGE_DEPENDENCY__SOURCE_TEMPLATE, oldSourceTemplate, sourceTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.PAGE_DEPENDENCY__SOURCE_TEMPLATE, oldSourceTemplate, sourceTemplate));
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
	public Page getSourcePage() {
		if (sourcePage != null && sourcePage.eIsProxy()) {
			InternalEObject oldSourcePage = (InternalEObject)sourcePage;
			sourcePage = (Page)eResolveProxy(oldSourcePage);
			if (sourcePage != oldSourcePage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.PAGE_DEPENDENCY__SOURCE_PAGE, oldSourcePage, sourcePage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.PAGE_DEPENDENCY__SOURCE_PAGE, oldSourcePage, sourcePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.PAGE_DEPENDENCY__TARGET_PAGE:
				if (resolve) return getTargetPage();
				return basicGetTargetPage();
			case FramewebPackage.PAGE_DEPENDENCY__SOURCE_TEMPLATE:
				if (resolve) return getSourceTemplate();
				return basicGetSourceTemplate();
			case FramewebPackage.PAGE_DEPENDENCY__LINK_HTML:
				return getLinkHTML();
			case FramewebPackage.PAGE_DEPENDENCY__SOURCE_PAGE:
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
			case FramewebPackage.PAGE_DEPENDENCY__TARGET_PAGE:
				setTargetPage((Page)newValue);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__SOURCE_TEMPLATE:
				setSourceTemplate((Template)newValue);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__LINK_HTML:
				setLinkHTML((String)newValue);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__SOURCE_PAGE:
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
			case FramewebPackage.PAGE_DEPENDENCY__TARGET_PAGE:
				setTargetPage((Page)null);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__SOURCE_TEMPLATE:
				setSourceTemplate((Template)null);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__LINK_HTML:
				setLinkHTML(LINK_HTML_EDEFAULT);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__SOURCE_PAGE:
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
			case FramewebPackage.PAGE_DEPENDENCY__TARGET_PAGE:
				return targetPage != null;
			case FramewebPackage.PAGE_DEPENDENCY__SOURCE_TEMPLATE:
				return sourceTemplate != null;
			case FramewebPackage.PAGE_DEPENDENCY__LINK_HTML:
				return LINK_HTML_EDEFAULT == null ? linkHTML != null : !LINK_HTML_EDEFAULT.equals(linkHTML);
			case FramewebPackage.PAGE_DEPENDENCY__SOURCE_PAGE:
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

} //PageDependencyImpl

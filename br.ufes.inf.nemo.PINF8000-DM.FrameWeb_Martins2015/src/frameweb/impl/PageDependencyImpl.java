/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.Page;
import frameweb.PageDependency;
import frameweb.Template;

import org.eclipse.emf.ecore.EClass;

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
		return (Page)eGet(FramewebPackage.Literals.PAGE_DEPENDENCY__TARGET_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPage(Page newTargetPage) {
		eSet(FramewebPackage.Literals.PAGE_DEPENDENCY__TARGET_PAGE, newTargetPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getSourceTemplate() {
		return (Template)eGet(FramewebPackage.Literals.PAGE_DEPENDENCY__SOURCE_TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTemplate(Template newSourceTemplate) {
		eSet(FramewebPackage.Literals.PAGE_DEPENDENCY__SOURCE_TEMPLATE, newSourceTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkHTML() {
		return (String)eGet(FramewebPackage.Literals.PAGE_DEPENDENCY__LINK_HTML, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkHTML(String newLinkHTML) {
		eSet(FramewebPackage.Literals.PAGE_DEPENDENCY__LINK_HTML, newLinkHTML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getSourcePage() {
		return (Page)eGet(FramewebPackage.Literals.PAGE_DEPENDENCY__SOURCE_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePage(Page newSourcePage) {
		eSet(FramewebPackage.Literals.PAGE_DEPENDENCY__SOURCE_PAGE, newSourcePage);
	}

} //PageDependencyImpl

/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.Page;
import frameweb.Tag;
import frameweb.TagLib;
import frameweb.UserViewAttribute;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PageImpl#getPageClassAttribute <em>Page Class Attribute</em>}</li>
 *   <li>{@link frameweb.impl.PageImpl#getPageTagLib <em>Page Tag Lib</em>}</li>
 *   <li>{@link frameweb.impl.PageImpl#getMention <em>Mention</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends NavigationClassImpl implements Page {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UserViewAttribute> getPageClassAttribute() {
		return (EList<UserViewAttribute>)eGet(FramewebPackage.Literals.PAGE__PAGE_CLASS_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getPageTagLib() {
		return (EList<Tag>)eGet(FramewebPackage.Literals.PAGE__PAGE_TAG_LIB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TagLib> getMention() {
		return (EList<TagLib>)eGet(FramewebPackage.Literals.PAGE__MENTION, true);
	}

} //PageImpl

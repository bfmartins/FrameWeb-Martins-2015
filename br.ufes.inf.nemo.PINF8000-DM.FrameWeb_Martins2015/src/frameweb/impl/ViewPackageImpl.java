/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.NavigationClass;
import frameweb.ViewPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ViewPackageImpl#getViewPackageClass <em>View Package Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewPackageImpl extends NavigationPackageImpl implements ViewPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.VIEW_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NavigationClass> getViewPackageClass() {
		return (EList<NavigationClass>)eGet(FramewebPackage.Literals.VIEW_PACKAGE__VIEW_PACKAGE_CLASS, true);
	}

} //ViewPackageImpl

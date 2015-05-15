/**
 */
package frameweb.impl;

import frameweb.ControllerPackage;
import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ControllerPackageImpl#getControllerPackageClass <em>Controller Package Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerPackageImpl extends NavigationPackageImpl implements ControllerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.CONTROLLER_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FrontControllerClass> getControllerPackageClass() {
		return (EList<FrontControllerClass>)eGet(FramewebPackage.Literals.CONTROLLER_PACKAGE__CONTROLLER_PACKAGE_CLASS, true);
	}

} //ControllerPackageImpl

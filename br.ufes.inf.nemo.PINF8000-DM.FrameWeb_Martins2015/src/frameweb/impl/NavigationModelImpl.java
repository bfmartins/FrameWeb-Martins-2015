/**
 */
package frameweb.impl;

import frameweb.ControllerPackage;
import frameweb.FramewebPackage;
import frameweb.NavigationComposition;
import frameweb.NavigationDependency;
import frameweb.NavigationModel;
import frameweb.ViewPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.NavigationModelImpl#getNavigationUMLDependency <em>Navigation UML Dependency</em>}</li>
 *   <li>{@link frameweb.impl.NavigationModelImpl#getViewUMLPackage <em>View UML Package</em>}</li>
 *   <li>{@link frameweb.impl.NavigationModelImpl#getControllerUMLPackage <em>Controller UML Package</em>}</li>
 *   <li>{@link frameweb.impl.NavigationModelImpl#getNavigationUMLComposition <em>Navigation UML Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationModelImpl extends FrameWebModelImpl implements NavigationModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.NAVIGATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NavigationDependency> getNavigationUMLDependency() {
		return (EList<NavigationDependency>)eGet(FramewebPackage.Literals.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ViewPackage> getViewUMLPackage() {
		return (EList<ViewPackage>)eGet(FramewebPackage.Literals.NAVIGATION_MODEL__VIEW_UML_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ControllerPackage> getControllerUMLPackage() {
		return (EList<ControllerPackage>)eGet(FramewebPackage.Literals.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NavigationComposition> getNavigationUMLComposition() {
		return (EList<NavigationComposition>)eGet(FramewebPackage.Literals.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION, true);
	}

} //NavigationModelImpl

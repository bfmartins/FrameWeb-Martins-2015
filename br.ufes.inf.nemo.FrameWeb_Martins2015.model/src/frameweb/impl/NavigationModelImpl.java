/**
 */
package frameweb.impl;

import frameweb.ControllerPackage;
import frameweb.FramewebPackage;
import frameweb.NavigationAssociation;
import frameweb.NavigationDependency;
import frameweb.NavigationModel;
import frameweb.ViewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getNavigationUMLDependency() <em>Navigation UML Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationUMLDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationDependency> navigationUMLDependency;

	/**
	 * The cached value of the '{@link #getViewUMLPackage() <em>View UML Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewUMLPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewPackage> viewUMLPackage;

	/**
	 * The cached value of the '{@link #getControllerUMLPackage() <em>Controller UML Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerUMLPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllerPackage> controllerUMLPackage;

	/**
	 * The cached value of the '{@link #getNavigationUMLComposition() <em>Navigation UML Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationUMLComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationAssociation> navigationUMLComposition;

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
	public EList<NavigationDependency> getNavigationUMLDependency() {
		if (navigationUMLDependency == null) {
			navigationUMLDependency = new EObjectContainmentEList<NavigationDependency>(NavigationDependency.class, this, FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCY);
		}
		return navigationUMLDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewPackage> getViewUMLPackage() {
		if (viewUMLPackage == null) {
			viewUMLPackage = new EObjectContainmentEList<ViewPackage>(ViewPackage.class, this, FramewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE);
		}
		return viewUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControllerPackage> getControllerUMLPackage() {
		if (controllerUMLPackage == null) {
			controllerUMLPackage = new EObjectContainmentEList<ControllerPackage>(ControllerPackage.class, this, FramewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE);
		}
		return controllerUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationAssociation> getNavigationUMLComposition() {
		if (navigationUMLComposition == null) {
			navigationUMLComposition = new EObjectContainmentEList<NavigationAssociation>(NavigationAssociation.class, this, FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION);
		}
		return navigationUMLComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCY:
				return ((InternalEList<?>)getNavigationUMLDependency()).basicRemove(otherEnd, msgs);
			case FramewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				return ((InternalEList<?>)getViewUMLPackage()).basicRemove(otherEnd, msgs);
			case FramewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				return ((InternalEList<?>)getControllerUMLPackage()).basicRemove(otherEnd, msgs);
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				return ((InternalEList<?>)getNavigationUMLComposition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCY:
				return getNavigationUMLDependency();
			case FramewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				return getViewUMLPackage();
			case FramewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				return getControllerUMLPackage();
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				return getNavigationUMLComposition();
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
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCY:
				getNavigationUMLDependency().clear();
				getNavigationUMLDependency().addAll((Collection<? extends NavigationDependency>)newValue);
				return;
			case FramewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				getViewUMLPackage().clear();
				getViewUMLPackage().addAll((Collection<? extends ViewPackage>)newValue);
				return;
			case FramewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				getControllerUMLPackage().clear();
				getControllerUMLPackage().addAll((Collection<? extends ControllerPackage>)newValue);
				return;
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				getNavigationUMLComposition().clear();
				getNavigationUMLComposition().addAll((Collection<? extends NavigationAssociation>)newValue);
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
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCY:
				getNavigationUMLDependency().clear();
				return;
			case FramewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				getViewUMLPackage().clear();
				return;
			case FramewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				getControllerUMLPackage().clear();
				return;
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				getNavigationUMLComposition().clear();
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
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCY:
				return navigationUMLDependency != null && !navigationUMLDependency.isEmpty();
			case FramewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				return viewUMLPackage != null && !viewUMLPackage.isEmpty();
			case FramewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				return controllerUMLPackage != null && !controllerUMLPackage.isEmpty();
			case FramewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				return navigationUMLComposition != null && !navigationUMLComposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationModelImpl

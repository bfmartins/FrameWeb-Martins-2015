/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.NavigationClass;
import frameweb.ResultType;
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
 * An implementation of the model object '<em><b>View Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ViewPackageImpl#getViewPackageClass <em>View Package Class</em>}</li>
 *   <li>{@link frameweb.impl.ViewPackageImpl#getViewPackageResult <em>View Package Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewPackageImpl extends NavigationPackageImpl implements ViewPackage {
	/**
	 * The cached value of the '{@link #getViewPackageClass() <em>View Package Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPackageClass()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationClass> viewPackageClass;

	/**
	 * The cached value of the '{@link #getViewPackageResult() <em>View Package Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPackageResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultType> viewPackageResult;

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
	public EList<NavigationClass> getViewPackageClass() {
		if (viewPackageClass == null) {
			viewPackageClass = new EObjectContainmentEList<NavigationClass>(NavigationClass.class, this, FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_CLASS);
		}
		return viewPackageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultType> getViewPackageResult() {
		if (viewPackageResult == null) {
			viewPackageResult = new EObjectContainmentEList<ResultType>(ResultType.class, this, FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_RESULT);
		}
		return viewPackageResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_CLASS:
				return ((InternalEList<?>)getViewPackageClass()).basicRemove(otherEnd, msgs);
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_RESULT:
				return ((InternalEList<?>)getViewPackageResult()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_CLASS:
				return getViewPackageClass();
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_RESULT:
				return getViewPackageResult();
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
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_CLASS:
				getViewPackageClass().clear();
				getViewPackageClass().addAll((Collection<? extends NavigationClass>)newValue);
				return;
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_RESULT:
				getViewPackageResult().clear();
				getViewPackageResult().addAll((Collection<? extends ResultType>)newValue);
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
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_CLASS:
				getViewPackageClass().clear();
				return;
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_RESULT:
				getViewPackageResult().clear();
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
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_CLASS:
				return viewPackageClass != null && !viewPackageClass.isEmpty();
			case FramewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_RESULT:
				return viewPackageResult != null && !viewPackageResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewPackageImpl

/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.FrontControllerMethod;
import frameweb.ResultDependency;
import frameweb.ResultType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getReturnResult <em>Return Result</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getReturnMethod <em>Return Method</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getReturnResultType <em>Return Result Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultDependencyImpl extends NavigationDependencyImpl implements ResultDependency {
	/**
	 * The cached value of the '{@link #getReturnResult() <em>Return Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultType> returnResult;

	/**
	 * The cached value of the '{@link #getReturnMethod() <em>Return Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod returnMethod;

	/**
	 * The cached value of the '{@link #getReturnResultType() <em>Return Result Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnResultType()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultType> returnResultType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.RESULT_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultType> getReturnResult() {
		if (returnResult == null) {
			returnResult = new EObjectResolvingEList<ResultType>(ResultType.class, this, FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT);
		}
		return returnResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getReturnMethod() {
		if (returnMethod != null && returnMethod.eIsProxy()) {
			InternalEObject oldReturnMethod = (InternalEObject)returnMethod;
			returnMethod = (FrontControllerMethod)eResolveProxy(oldReturnMethod);
			if (returnMethod != oldReturnMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD, oldReturnMethod, returnMethod));
			}
		}
		return returnMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetReturnMethod() {
		return returnMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnMethod(FrontControllerMethod newReturnMethod) {
		FrontControllerMethod oldReturnMethod = returnMethod;
		returnMethod = newReturnMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD, oldReturnMethod, returnMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultType> getReturnResultType() {
		if (returnResultType == null) {
			returnResultType = new EObjectResolvingEList<ResultType>(ResultType.class, this, FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE);
		}
		return returnResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT:
				return getReturnResult();
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD:
				if (resolve) return getReturnMethod();
				return basicGetReturnMethod();
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE:
				return getReturnResultType();
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
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT:
				getReturnResult().clear();
				getReturnResult().addAll((Collection<? extends ResultType>)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD:
				setReturnMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE:
				getReturnResultType().clear();
				getReturnResultType().addAll((Collection<? extends ResultType>)newValue);
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
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT:
				getReturnResult().clear();
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD:
				setReturnMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE:
				getReturnResultType().clear();
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
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT:
				return returnResult != null && !returnResult.isEmpty();
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD:
				return returnMethod != null;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE:
				return returnResultType != null && !returnResultType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultDependencyImpl

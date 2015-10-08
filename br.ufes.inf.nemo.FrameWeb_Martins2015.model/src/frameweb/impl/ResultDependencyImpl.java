/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.FrontControllerMethod;
import frameweb.ResultConstraint;
import frameweb.ResultDependency;
import frameweb.ResultType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
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
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getResultResult <em>Result Result</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getResultMethod <em>Result Method</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getResultDependendencyCosntraint <em>Result Dependendency Cosntraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultDependencyImpl extends NavigationDependencyImpl implements ResultDependency {
	/**
	 * The cached value of the '{@link #getResultResult() <em>Result Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultType> resultResult;

	/**
	 * The cached value of the '{@link #getResultMethod() <em>Result Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod resultMethod;

	/**
	 * The cached value of the '{@link #getResultDependendencyCosntraint() <em>Result Dependendency Cosntraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDependendencyCosntraint()
	 * @generated
	 * @ordered
	 */
	protected ResultConstraint resultDependendencyCosntraint;

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
	public EList<ResultType> getResultResult() {
		if (resultResult == null) {
			resultResult = new EObjectResolvingEList<ResultType>(ResultType.class, this, FramewebPackage.RESULT_DEPENDENCY__RESULT_RESULT);
		}
		return resultResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getResultMethod() {
		if (resultMethod != null && resultMethod.eIsProxy()) {
			InternalEObject oldResultMethod = (InternalEObject)resultMethod;
			resultMethod = (FrontControllerMethod)eResolveProxy(oldResultMethod);
			if (resultMethod != oldResultMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD, oldResultMethod, resultMethod));
			}
		}
		return resultMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetResultMethod() {
		return resultMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultMethod(FrontControllerMethod newResultMethod) {
		FrontControllerMethod oldResultMethod = resultMethod;
		resultMethod = newResultMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD, oldResultMethod, resultMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultConstraint getResultDependendencyCosntraint() {
		return resultDependendencyCosntraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultDependendencyCosntraint(ResultConstraint newResultDependendencyCosntraint, NotificationChain msgs) {
		ResultConstraint oldResultDependendencyCosntraint = resultDependendencyCosntraint;
		resultDependendencyCosntraint = newResultDependendencyCosntraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT, oldResultDependendencyCosntraint, newResultDependendencyCosntraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultDependendencyCosntraint(ResultConstraint newResultDependendencyCosntraint) {
		if (newResultDependendencyCosntraint != resultDependendencyCosntraint) {
			NotificationChain msgs = null;
			if (resultDependendencyCosntraint != null)
				msgs = ((InternalEObject)resultDependendencyCosntraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT, null, msgs);
			if (newResultDependendencyCosntraint != null)
				msgs = ((InternalEObject)newResultDependendencyCosntraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT, null, msgs);
			msgs = basicSetResultDependendencyCosntraint(newResultDependendencyCosntraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT, newResultDependendencyCosntraint, newResultDependendencyCosntraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT:
				return basicSetResultDependendencyCosntraint(null, msgs);
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
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_RESULT:
				return getResultResult();
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD:
				if (resolve) return getResultMethod();
				return basicGetResultMethod();
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT:
				return getResultDependendencyCosntraint();
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
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_RESULT:
				getResultResult().clear();
				getResultResult().addAll((Collection<? extends ResultType>)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD:
				setResultMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT:
				setResultDependendencyCosntraint((ResultConstraint)newValue);
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
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_RESULT:
				getResultResult().clear();
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD:
				setResultMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT:
				setResultDependendencyCosntraint((ResultConstraint)null);
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
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_RESULT:
				return resultResult != null && !resultResult.isEmpty();
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD:
				return resultMethod != null;
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT:
				return resultDependendencyCosntraint != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultDependencyImpl

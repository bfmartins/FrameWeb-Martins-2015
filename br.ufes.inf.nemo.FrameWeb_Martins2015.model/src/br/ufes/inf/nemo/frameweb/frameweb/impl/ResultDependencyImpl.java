/**
 */
package br.ufes.inf.nemo.frameweb.frameweb.impl;

import br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.frameweb.Result;
import br.ufes.inf.nemo.frameweb.frameweb.ResultConstraint;
import br.ufes.inf.nemo.frameweb.frameweb.ResultDependency;

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
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.ResultDependencyImpl#getResultResult <em>Result Result</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.ResultDependencyImpl#getResultMethod <em>Result Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.ResultDependencyImpl#getResultDependendencyCosntraint <em>Result Dependendency Cosntraint</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.ResultDependencyImpl#getRender <em>Render</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.ResultDependencyImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.ResultDependencyImpl#isAjax <em>Ajax</em>}</li>
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
	protected EList<Result> resultResult;

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
	 * The default value of the '{@link #getRender() <em>Render</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRender()
	 * @generated
	 * @ordered
	 */
	protected static final String RENDER_EDEFAULT = "@none";

	/**
	 * The cached value of the '{@link #getRender() <em>Render</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRender()
	 * @generated
	 * @ordered
	 */
	protected String render = RENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTE_EDEFAULT = "@this";

	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected String execute = EXECUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAjax() <em>Ajax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAjax()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AJAX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAjax() <em>Ajax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAjax()
	 * @generated
	 * @ordered
	 */
	protected boolean ajax = AJAX_EDEFAULT;

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
	public EList<Result> getResultResult() {
		if (resultResult == null) {
			resultResult = new EObjectResolvingEList<Result>(Result.class, this, FramewebPackage.RESULT_DEPENDENCY__RESULT_RESULT);
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
	public String getRender() {
		return render;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRender(String newRender) {
		String oldRender = render;
		render = newRender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__RENDER, oldRender, render));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecute() {
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecute(String newExecute) {
		String oldExecute = execute;
		execute = newExecute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__EXECUTE, oldExecute, execute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAjax() {
		return ajax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAjax(boolean newAjax) {
		boolean oldAjax = ajax;
		ajax = newAjax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__AJAX, oldAjax, ajax));
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
			case FramewebPackage.RESULT_DEPENDENCY__RENDER:
				return getRender();
			case FramewebPackage.RESULT_DEPENDENCY__EXECUTE:
				return getExecute();
			case FramewebPackage.RESULT_DEPENDENCY__AJAX:
				return isAjax();
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
				getResultResult().addAll((Collection<? extends Result>)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD:
				setResultMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT:
				setResultDependendencyCosntraint((ResultConstraint)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RENDER:
				setRender((String)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__EXECUTE:
				setExecute((String)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__AJAX:
				setAjax((Boolean)newValue);
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
			case FramewebPackage.RESULT_DEPENDENCY__RENDER:
				setRender(RENDER_EDEFAULT);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__EXECUTE:
				setExecute(EXECUTE_EDEFAULT);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__AJAX:
				setAjax(AJAX_EDEFAULT);
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
			case FramewebPackage.RESULT_DEPENDENCY__RENDER:
				return RENDER_EDEFAULT == null ? render != null : !RENDER_EDEFAULT.equals(render);
			case FramewebPackage.RESULT_DEPENDENCY__EXECUTE:
				return EXECUTE_EDEFAULT == null ? execute != null : !EXECUTE_EDEFAULT.equals(execute);
			case FramewebPackage.RESULT_DEPENDENCY__AJAX:
				return ajax != AJAX_EDEFAULT;
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
		result.append(" (render: ");
		result.append(render);
		result.append(", execute: ");
		result.append(execute);
		result.append(", ajax: ");
		result.append(ajax);
		result.append(')');
		return result.toString();
	}

} //ResultDependencyImpl

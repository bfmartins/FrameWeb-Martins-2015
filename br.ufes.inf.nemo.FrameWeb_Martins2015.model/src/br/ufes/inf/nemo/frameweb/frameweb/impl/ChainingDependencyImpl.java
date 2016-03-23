/**
 */
package br.ufes.inf.nemo.frameweb.frameweb.impl;

import br.ufes.inf.nemo.frameweb.frameweb.ChainingConstraint;
import br.ufes.inf.nemo.frameweb.frameweb.ChainingDependency;
import br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.frameweb.FrontControllerMethod;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chaining Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.ChainingDependencyImpl#getOutMethod <em>Out Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.ChainingDependencyImpl#getInMethod <em>In Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.ChainingDependencyImpl#getChainingDependendencyConstraint <em>Chaining Dependendency Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainingDependencyImpl extends NavigationDependencyImpl implements ChainingDependency {
	/**
	 * The cached value of the '{@link #getOutMethod() <em>Out Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod outMethod;

	/**
	 * The cached value of the '{@link #getInMethod() <em>In Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod inMethod;

	/**
	 * The cached value of the '{@link #getChainingDependendencyConstraint() <em>Chaining Dependendency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainingDependendencyConstraint()
	 * @generated
	 * @ordered
	 */
	protected ChainingConstraint chainingDependendencyConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainingDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.CHAINING_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getOutMethod() {
		if (outMethod != null && outMethod.eIsProxy()) {
			InternalEObject oldOutMethod = (InternalEObject)outMethod;
			outMethod = (FrontControllerMethod)eResolveProxy(oldOutMethod);
			if (outMethod != oldOutMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD, oldOutMethod, outMethod));
			}
		}
		return outMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetOutMethod() {
		return outMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutMethod(FrontControllerMethod newOutMethod) {
		FrontControllerMethod oldOutMethod = outMethod;
		outMethod = newOutMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD, oldOutMethod, outMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getInMethod() {
		if (inMethod != null && inMethod.eIsProxy()) {
			InternalEObject oldInMethod = (InternalEObject)inMethod;
			inMethod = (FrontControllerMethod)eResolveProxy(oldInMethod);
			if (inMethod != oldInMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD, oldInMethod, inMethod));
			}
		}
		return inMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetInMethod() {
		return inMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMethod(FrontControllerMethod newInMethod) {
		FrontControllerMethod oldInMethod = inMethod;
		inMethod = newInMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD, oldInMethod, inMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainingConstraint getChainingDependendencyConstraint() {
		return chainingDependendencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainingDependendencyConstraint(ChainingConstraint newChainingDependendencyConstraint, NotificationChain msgs) {
		ChainingConstraint oldChainingDependendencyConstraint = chainingDependendencyConstraint;
		chainingDependendencyConstraint = newChainingDependendencyConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT, oldChainingDependendencyConstraint, newChainingDependendencyConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainingDependendencyConstraint(ChainingConstraint newChainingDependendencyConstraint) {
		if (newChainingDependendencyConstraint != chainingDependendencyConstraint) {
			NotificationChain msgs = null;
			if (chainingDependendencyConstraint != null)
				msgs = ((InternalEObject)chainingDependendencyConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT, null, msgs);
			if (newChainingDependendencyConstraint != null)
				msgs = ((InternalEObject)newChainingDependendencyConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT, null, msgs);
			msgs = basicSetChainingDependendencyConstraint(newChainingDependendencyConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT, newChainingDependendencyConstraint, newChainingDependendencyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT:
				return basicSetChainingDependendencyConstraint(null, msgs);
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
			case FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD:
				if (resolve) return getOutMethod();
				return basicGetOutMethod();
			case FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD:
				if (resolve) return getInMethod();
				return basicGetInMethod();
			case FramewebPackage.CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT:
				return getChainingDependendencyConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD:
				setOutMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD:
				setInMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT:
				setChainingDependendencyConstraint((ChainingConstraint)newValue);
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
			case FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD:
				setOutMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD:
				setInMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT:
				setChainingDependendencyConstraint((ChainingConstraint)null);
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
			case FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD:
				return outMethod != null;
			case FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD:
				return inMethod != null;
			case FramewebPackage.CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT:
				return chainingDependendencyConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //ChainingDependencyImpl

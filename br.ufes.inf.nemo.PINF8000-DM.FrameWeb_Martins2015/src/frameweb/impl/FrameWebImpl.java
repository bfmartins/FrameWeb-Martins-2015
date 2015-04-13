/**
 */
package frameweb.impl;

import frameweb.FrameWeb;
import frameweb.FrameWebModel;
import frameweb.FrameWebPackage;
import frameweb.Framework;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame Web</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrameWebImpl#getCompose <em>Compose</em>}</li>
 *   <li>{@link frameweb.impl.FrameWebImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameWebImpl extends MinimalEObjectImpl.Container implements FrameWeb {
	/**
	 * The cached value of the '{@link #getCompose() <em>Compose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompose()
	 * @generated
	 * @ordered
	 */
	protected FrameWebModel compose;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Framework> uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameWebImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrameWebPackage.Literals.FRAME_WEB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameWebModel getCompose() {
		return compose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompose(FrameWebModel newCompose, NotificationChain msgs) {
		FrameWebModel oldCompose = compose;
		compose = newCompose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FrameWebPackage.FRAME_WEB__COMPOSE, oldCompose, newCompose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompose(FrameWebModel newCompose) {
		if (newCompose != compose) {
			NotificationChain msgs = null;
			if (compose != null)
				msgs = ((InternalEObject)compose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FrameWebPackage.FRAME_WEB__COMPOSE, null, msgs);
			if (newCompose != null)
				msgs = ((InternalEObject)newCompose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FrameWebPackage.FRAME_WEB__COMPOSE, null, msgs);
			msgs = basicSetCompose(newCompose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.FRAME_WEB__COMPOSE, newCompose, newCompose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Framework> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<Framework>(Framework.class, this, FrameWebPackage.FRAME_WEB__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameWebPackage.FRAME_WEB__COMPOSE:
				return basicSetCompose(null, msgs);
			case FrameWebPackage.FRAME_WEB__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
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
			case FrameWebPackage.FRAME_WEB__COMPOSE:
				return getCompose();
			case FrameWebPackage.FRAME_WEB__USES:
				return getUses();
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
			case FrameWebPackage.FRAME_WEB__COMPOSE:
				setCompose((FrameWebModel)newValue);
				return;
			case FrameWebPackage.FRAME_WEB__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Framework>)newValue);
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
			case FrameWebPackage.FRAME_WEB__COMPOSE:
				setCompose((FrameWebModel)null);
				return;
			case FrameWebPackage.FRAME_WEB__USES:
				getUses().clear();
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
			case FrameWebPackage.FRAME_WEB__COMPOSE:
				return compose != null;
			case FrameWebPackage.FRAME_WEB__USES:
				return uses != null && !uses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FrameWebImpl

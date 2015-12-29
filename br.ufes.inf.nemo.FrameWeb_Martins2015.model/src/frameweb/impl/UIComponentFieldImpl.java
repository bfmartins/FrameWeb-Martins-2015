/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.IOParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Component Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.UIComponentFieldImpl#getInject <em>Inject</em>}</li>
 *   <li>{@link frameweb.impl.UIComponentFieldImpl#isAjax <em>Ajax</em>}</li>
 *   <li>{@link frameweb.impl.UIComponentFieldImpl#getRender <em>Render</em>}</li>
 *   <li>{@link frameweb.impl.UIComponentFieldImpl#getExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UIComponentFieldImpl extends NavigationAttributeImpl implements Tag {
	/**
	 * The cached value of the '{@link #getInject() <em>Inject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInject()
	 * @generated
	 * @ordered
	 */
	protected IOParameter inject;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIComponentFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.UI_COMPONENT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter getInject() {
		if (inject != null && inject.eIsProxy()) {
			InternalEObject oldInject = (InternalEObject)inject;
			inject = (IOParameter)eResolveProxy(oldInject);
			if (inject != oldInject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.UI_COMPONENT_FIELD__INJECT, oldInject, inject));
			}
		}
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter basicGetInject() {
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInject(IOParameter newInject, NotificationChain msgs) {
		IOParameter oldInject = inject;
		inject = newInject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.UI_COMPONENT_FIELD__INJECT, oldInject, newInject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInject(IOParameter newInject) {
		if (newInject != inject) {
			NotificationChain msgs = null;
			if (inject != null)
				msgs = ((InternalEObject)inject).eInverseRemove(this, FramewebPackage.IO_PARAMETER__DISPLAY, IOParameter.class, msgs);
			if (newInject != null)
				msgs = ((InternalEObject)newInject).eInverseAdd(this, FramewebPackage.IO_PARAMETER__DISPLAY, IOParameter.class, msgs);
			msgs = basicSetInject(newInject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.UI_COMPONENT_FIELD__INJECT, newInject, newInject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.UI_COMPONENT_FIELD__AJAX, oldAjax, ajax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.UI_COMPONENT_FIELD__RENDER, oldRender, render));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.UI_COMPONENT_FIELD__EXECUTE, oldExecute, execute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
				if (inject != null)
					msgs = ((InternalEObject)inject).eInverseRemove(this, FramewebPackage.IO_PARAMETER__DISPLAY, IOParameter.class, msgs);
				return basicSetInject((IOParameter)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
				return basicSetInject(null, msgs);
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
			case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
				if (resolve) return getInject();
				return basicGetInject();
			case FramewebPackage.UI_COMPONENT_FIELD__AJAX:
				return isAjax();
			case FramewebPackage.UI_COMPONENT_FIELD__RENDER:
				return getRender();
			case FramewebPackage.UI_COMPONENT_FIELD__EXECUTE:
				return getExecute();
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
			case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
				setInject((IOParameter)newValue);
				return;
			case FramewebPackage.UI_COMPONENT_FIELD__AJAX:
				setAjax((Boolean)newValue);
				return;
			case FramewebPackage.UI_COMPONENT_FIELD__RENDER:
				setRender((String)newValue);
				return;
			case FramewebPackage.UI_COMPONENT_FIELD__EXECUTE:
				setExecute((String)newValue);
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
			case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
				setInject((IOParameter)null);
				return;
			case FramewebPackage.UI_COMPONENT_FIELD__AJAX:
				setAjax(AJAX_EDEFAULT);
				return;
			case FramewebPackage.UI_COMPONENT_FIELD__RENDER:
				setRender(RENDER_EDEFAULT);
				return;
			case FramewebPackage.UI_COMPONENT_FIELD__EXECUTE:
				setExecute(EXECUTE_EDEFAULT);
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
			case FramewebPackage.UI_COMPONENT_FIELD__INJECT:
				return inject != null;
			case FramewebPackage.UI_COMPONENT_FIELD__AJAX:
				return ajax != AJAX_EDEFAULT;
			case FramewebPackage.UI_COMPONENT_FIELD__RENDER:
				return RENDER_EDEFAULT == null ? render != null : !RENDER_EDEFAULT.equals(render);
			case FramewebPackage.UI_COMPONENT_FIELD__EXECUTE:
				return EXECUTE_EDEFAULT == null ? execute != null : !EXECUTE_EDEFAULT.equals(execute);
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
		result.append(" (ajax: ");
		result.append(ajax);
		result.append(", render: ");
		result.append(render);
		result.append(", execute: ");
		result.append(execute);
		result.append(')');
		return result.toString();
	}

} //UIComponentFieldImpl

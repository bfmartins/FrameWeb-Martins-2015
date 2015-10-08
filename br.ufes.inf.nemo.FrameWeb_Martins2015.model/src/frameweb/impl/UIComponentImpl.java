/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.UIComponentImpl#isAjax <em>Ajax</em>}</li>
 *   <li>{@link frameweb.impl.UIComponentImpl#getRender <em>Render</em>}</li>
 *   <li>{@link frameweb.impl.UIComponentImpl#getExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIComponentImpl extends NavigationClassImpl implements Tag {
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
	protected UIComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.UI_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.UI_COMPONENT__AJAX, oldAjax, ajax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.UI_COMPONENT__RENDER, oldRender, render));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.UI_COMPONENT__EXECUTE, oldExecute, execute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.UI_COMPONENT__AJAX:
				return isAjax();
			case FramewebPackage.UI_COMPONENT__RENDER:
				return getRender();
			case FramewebPackage.UI_COMPONENT__EXECUTE:
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
			case FramewebPackage.UI_COMPONENT__AJAX:
				setAjax((Boolean)newValue);
				return;
			case FramewebPackage.UI_COMPONENT__RENDER:
				setRender((String)newValue);
				return;
			case FramewebPackage.UI_COMPONENT__EXECUTE:
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
			case FramewebPackage.UI_COMPONENT__AJAX:
				setAjax(AJAX_EDEFAULT);
				return;
			case FramewebPackage.UI_COMPONENT__RENDER:
				setRender(RENDER_EDEFAULT);
				return;
			case FramewebPackage.UI_COMPONENT__EXECUTE:
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
			case FramewebPackage.UI_COMPONENT__AJAX:
				return ajax != AJAX_EDEFAULT;
			case FramewebPackage.UI_COMPONENT__RENDER:
				return RENDER_EDEFAULT == null ? render != null : !RENDER_EDEFAULT.equals(render);
			case FramewebPackage.UI_COMPONENT__EXECUTE:
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

} //UIComponentImpl

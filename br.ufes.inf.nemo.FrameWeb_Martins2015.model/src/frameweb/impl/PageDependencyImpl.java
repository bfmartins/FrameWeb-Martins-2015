/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.PageConstraint;
import frameweb.PageDependency;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PageDependencyImpl#getPageDependencyCosntraint <em>Page Dependency Cosntraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageDependencyImpl extends NavigationDependencyImpl implements PageDependency {
	/**
	 * The cached value of the '{@link #getPageDependencyCosntraint() <em>Page Dependency Cosntraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageDependencyCosntraint()
	 * @generated
	 * @ordered
	 */
	protected PageConstraint pageDependencyCosntraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.PAGE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageConstraint getPageDependencyCosntraint() {
		return pageDependencyCosntraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageDependencyCosntraint(PageConstraint newPageDependencyCosntraint, NotificationChain msgs) {
		PageConstraint oldPageDependencyCosntraint = pageDependencyCosntraint;
		pageDependencyCosntraint = newPageDependencyCosntraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT, oldPageDependencyCosntraint, newPageDependencyCosntraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageDependencyCosntraint(PageConstraint newPageDependencyCosntraint) {
		if (newPageDependencyCosntraint != pageDependencyCosntraint) {
			NotificationChain msgs = null;
			if (pageDependencyCosntraint != null)
				msgs = ((InternalEObject)pageDependencyCosntraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT, null, msgs);
			if (newPageDependencyCosntraint != null)
				msgs = ((InternalEObject)newPageDependencyCosntraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT, null, msgs);
			msgs = basicSetPageDependencyCosntraint(newPageDependencyCosntraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT, newPageDependencyCosntraint, newPageDependencyCosntraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT:
				return basicSetPageDependencyCosntraint(null, msgs);
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
			case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT:
				return getPageDependencyCosntraint();
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
			case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT:
				setPageDependencyCosntraint((PageConstraint)newValue);
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
			case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT:
				setPageDependencyCosntraint((PageConstraint)null);
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
			case FramewebPackage.PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT:
				return pageDependencyCosntraint != null;
		}
		return super.eIsSet(featureID);
	}

} //PageDependencyImpl

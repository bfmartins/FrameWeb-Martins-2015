/**
 */
package frameweb.impl;

import frameweb.Binary;
import frameweb.Component;
import frameweb.Form;
import frameweb.Page;
import frameweb.Template;
import frameweb.ViewPackage;
import frameweb.framewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ViewPackageImpl#getViewPackagePage <em>View Package Page</em>}</li>
 *   <li>{@link frameweb.impl.ViewPackageImpl#getViewPakageTemplate <em>View Pakage Template</em>}</li>
 *   <li>{@link frameweb.impl.ViewPackageImpl#getViewPackageForm <em>View Package Form</em>}</li>
 *   <li>{@link frameweb.impl.ViewPackageImpl#getViewPackageBinaryData <em>View Package Binary Data</em>}</li>
 *   <li>{@link frameweb.impl.ViewPackageImpl#getViewPackageComponent <em>View Package Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewPackageImpl extends NavigationPackageImpl implements ViewPackage {
	/**
	 * The cached value of the '{@link #getViewPackagePage() <em>View Package Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPackagePage()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> viewPackagePage;

	/**
	 * The cached value of the '{@link #getViewPakageTemplate() <em>View Pakage Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPakageTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<Template> viewPakageTemplate;

	/**
	 * The cached value of the '{@link #getViewPackageForm() <em>View Package Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPackageForm()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> viewPackageForm;

	/**
	 * The cached value of the '{@link #getViewPackageBinaryData() <em>View Package Binary Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPackageBinaryData()
	 * @generated
	 * @ordered
	 */
	protected Binary viewPackageBinaryData;

	/**
	 * The cached value of the '{@link #getViewPackageComponent() <em>View Package Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPackageComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> viewPackageComponent;

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
		return framewebPackage.Literals.VIEW_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getViewPackagePage() {
		if (viewPackagePage == null) {
			viewPackagePage = new EObjectContainmentEList<Page>(Page.class, this, framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_PAGE);
		}
		return viewPackagePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Template> getViewPakageTemplate() {
		if (viewPakageTemplate == null) {
			viewPakageTemplate = new EObjectContainmentEList<Template>(Template.class, this, framewebPackage.VIEW_PACKAGE__VIEW_PAKAGE_TEMPLATE);
		}
		return viewPakageTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getViewPackageForm() {
		if (viewPackageForm == null) {
			viewPackageForm = new EObjectContainmentEList<Form>(Form.class, this, framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_FORM);
		}
		return viewPackageForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary getViewPackageBinaryData() {
		return viewPackageBinaryData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewPackageBinaryData(Binary newViewPackageBinaryData, NotificationChain msgs) {
		Binary oldViewPackageBinaryData = viewPackageBinaryData;
		viewPackageBinaryData = newViewPackageBinaryData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_BINARY_DATA, oldViewPackageBinaryData, newViewPackageBinaryData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewPackageBinaryData(Binary newViewPackageBinaryData) {
		if (newViewPackageBinaryData != viewPackageBinaryData) {
			NotificationChain msgs = null;
			if (viewPackageBinaryData != null)
				msgs = ((InternalEObject)viewPackageBinaryData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_BINARY_DATA, null, msgs);
			if (newViewPackageBinaryData != null)
				msgs = ((InternalEObject)newViewPackageBinaryData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_BINARY_DATA, null, msgs);
			msgs = basicSetViewPackageBinaryData(newViewPackageBinaryData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_BINARY_DATA, newViewPackageBinaryData, newViewPackageBinaryData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getViewPackageComponent() {
		if (viewPackageComponent == null) {
			viewPackageComponent = new EObjectContainmentEList<Component>(Component.class, this, framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_COMPONENT);
		}
		return viewPackageComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_PAGE:
				return ((InternalEList<?>)getViewPackagePage()).basicRemove(otherEnd, msgs);
			case framewebPackage.VIEW_PACKAGE__VIEW_PAKAGE_TEMPLATE:
				return ((InternalEList<?>)getViewPakageTemplate()).basicRemove(otherEnd, msgs);
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_FORM:
				return ((InternalEList<?>)getViewPackageForm()).basicRemove(otherEnd, msgs);
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_BINARY_DATA:
				return basicSetViewPackageBinaryData(null, msgs);
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_COMPONENT:
				return ((InternalEList<?>)getViewPackageComponent()).basicRemove(otherEnd, msgs);
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
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_PAGE:
				return getViewPackagePage();
			case framewebPackage.VIEW_PACKAGE__VIEW_PAKAGE_TEMPLATE:
				return getViewPakageTemplate();
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_FORM:
				return getViewPackageForm();
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_BINARY_DATA:
				return getViewPackageBinaryData();
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_COMPONENT:
				return getViewPackageComponent();
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
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_PAGE:
				getViewPackagePage().clear();
				getViewPackagePage().addAll((Collection<? extends Page>)newValue);
				return;
			case framewebPackage.VIEW_PACKAGE__VIEW_PAKAGE_TEMPLATE:
				getViewPakageTemplate().clear();
				getViewPakageTemplate().addAll((Collection<? extends Template>)newValue);
				return;
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_FORM:
				getViewPackageForm().clear();
				getViewPackageForm().addAll((Collection<? extends Form>)newValue);
				return;
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_BINARY_DATA:
				setViewPackageBinaryData((Binary)newValue);
				return;
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_COMPONENT:
				getViewPackageComponent().clear();
				getViewPackageComponent().addAll((Collection<? extends Component>)newValue);
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
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_PAGE:
				getViewPackagePage().clear();
				return;
			case framewebPackage.VIEW_PACKAGE__VIEW_PAKAGE_TEMPLATE:
				getViewPakageTemplate().clear();
				return;
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_FORM:
				getViewPackageForm().clear();
				return;
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_BINARY_DATA:
				setViewPackageBinaryData((Binary)null);
				return;
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_COMPONENT:
				getViewPackageComponent().clear();
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
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_PAGE:
				return viewPackagePage != null && !viewPackagePage.isEmpty();
			case framewebPackage.VIEW_PACKAGE__VIEW_PAKAGE_TEMPLATE:
				return viewPakageTemplate != null && !viewPakageTemplate.isEmpty();
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_FORM:
				return viewPackageForm != null && !viewPackageForm.isEmpty();
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_BINARY_DATA:
				return viewPackageBinaryData != null;
			case framewebPackage.VIEW_PACKAGE__VIEW_PACKAGE_COMPONENT:
				return viewPackageComponent != null && !viewPackageComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewPackageImpl

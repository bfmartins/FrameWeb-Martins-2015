/**
 */
package frameweb.provider;


import frameweb.FramewebPackage;
import frameweb.FrontControllerDependency;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link frameweb.FrontControllerDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FrontControllerDependencyItemProvider extends NavigationDependencyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerDependencyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMethodPropertyDescriptor(object);
			addClientFormPropertyDescriptor(object);
			addSupplierFrontControllerPropertyDescriptor(object);
			addClientPagePropertyDescriptor(object);
			addClientTemplatePropertyDescriptor(object);
			addClientComponentPropertyDescriptor(object);
			addClientJQueryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependency_Method_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependency_Method_feature", "_UI_FrontControllerDependency_type"),
				 FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__METHOD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Form feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientFormPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependency_ClientForm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependency_ClientForm_feature", "_UI_FrontControllerDependency_type"),
				 FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__CLIENT_FORM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier Front Controller feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplierFrontControllerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependency_SupplierFrontController_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependency_SupplierFrontController_feature", "_UI_FrontControllerDependency_type"),
				 FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientPagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependency_ClientPage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependency_ClientPage_feature", "_UI_FrontControllerDependency_type"),
				 FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__CLIENT_PAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependency_ClientTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependency_ClientTemplate_feature", "_UI_FrontControllerDependency_type"),
				 FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__CLIENT_TEMPLATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependency_ClientComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependency_ClientComponent_feature", "_UI_FrontControllerDependency_type"),
				 FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__CLIENT_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client JQuery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientJQueryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependency_ClientJQuery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependency_ClientJQuery_feature", "_UI_FrontControllerDependency_type"),
				 FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__CLIENT_JQUERY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns FrontControllerDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FrontControllerDependency"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FrontControllerDependency)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FrontControllerDependency_type") :
			getString("_UI_FrontControllerDependency_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}

/**
 */
package frameweb.provider;


import frameweb.FrameWebPackage;
import frameweb.FrontControllerDependence;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link frameweb.FrontControllerDependence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FrontControllerDependenceItemProvider extends NavigationDependencyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerDependenceItemProvider(AdapterFactory adapterFactory) {
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
			addSourceFormPropertyDescriptor(object);
			addTargetFrontControllerPropertyDescriptor(object);
			addSourcePagePropertyDescriptor(object);
			addSourceTemplatePropertyDescriptor(object);
			addSourceComponentPropertyDescriptor(object);
			addSourceJQueryPropertyDescriptor(object);
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
				 getString("_UI_FrontControllerDependence_Method_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependence_Method_feature", "_UI_FrontControllerDependence_type"),
				 FrameWebPackage.Literals.FRONT_CONTROLLER_DEPENDENCE__METHOD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Form feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceFormPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependence_SourceForm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependence_SourceForm_feature", "_UI_FrontControllerDependence_type"),
				 FrameWebPackage.Literals.FRONT_CONTROLLER_DEPENDENCE__SOURCE_FORM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Front Controller feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetFrontControllerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependence_TargetFrontController_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependence_TargetFrontController_feature", "_UI_FrontControllerDependence_type"),
				 FrameWebPackage.Literals.FRONT_CONTROLLER_DEPENDENCE__TARGET_FRONT_CONTROLLER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependence_SourcePage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependence_SourcePage_feature", "_UI_FrontControllerDependence_type"),
				 FrameWebPackage.Literals.FRONT_CONTROLLER_DEPENDENCE__SOURCE_PAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependence_SourceTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependence_SourceTemplate_feature", "_UI_FrontControllerDependence_type"),
				 FrameWebPackage.Literals.FRONT_CONTROLLER_DEPENDENCE__SOURCE_TEMPLATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependence_SourceComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependence_SourceComponent_feature", "_UI_FrontControllerDependence_type"),
				 FrameWebPackage.Literals.FRONT_CONTROLLER_DEPENDENCE__SOURCE_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source JQuery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceJQueryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrontControllerDependence_SourceJQuery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrontControllerDependence_SourceJQuery_feature", "_UI_FrontControllerDependence_type"),
				 FrameWebPackage.Literals.FRONT_CONTROLLER_DEPENDENCE__SOURCE_JQUERY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns FrontControllerDependence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FrontControllerDependence"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FrontControllerDependence)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FrontControllerDependence_type") :
			getString("_UI_FrontControllerDependence_type") + " " + label;
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

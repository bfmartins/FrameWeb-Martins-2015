/**
 */
package frameweb.provider;


import frameweb.FrameWebPackage;
import frameweb.ResultDependency;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link frameweb.ResultDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultDependencyItemProvider extends NavigationDependencyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultDependencyItemProvider(AdapterFactory adapterFactory) {
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

			addReturnResultPropertyDescriptor(object);
			addReturnMethodPropertyDescriptor(object);
			addSourceFrontControllerPropertyDescriptor(object);
			addTargetTemplatePropertyDescriptor(object);
			addTargetPagePropertyDescriptor(object);
			addTargetBinaryPropertyDescriptor(object);
			addReturnResultTypePropertyDescriptor(object);
			addTargetFormPropertyDescriptor(object);
			addTargetComponentPropertyDescriptor(object);
			addTargetJQueryPropertyDescriptor(object);
			addTargetFormComponentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Return Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_ReturnResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_ReturnResult_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__RETURN_RESULT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_ReturnMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_ReturnMethod_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__RETURN_METHOD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Front Controller feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceFrontControllerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_SourceFrontController_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_SourceFrontController_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__SOURCE_FRONT_CONTROLLER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_TargetTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_TargetTemplate_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__TARGET_TEMPLATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_TargetPage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_TargetPage_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__TARGET_PAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Binary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetBinaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_TargetBinary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_TargetBinary_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__TARGET_BINARY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Result Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnResultTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_ReturnResultType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_ReturnResultType_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__RETURN_RESULT_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Form feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetFormPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_TargetForm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_TargetForm_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__TARGET_FORM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_TargetComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_TargetComponent_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__TARGET_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target JQuery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetJQueryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_TargetJQuery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_TargetJQuery_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__TARGET_JQUERY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Form Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetFormComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResultDependency_TargetFormComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResultDependency_TargetFormComponent_feature", "_UI_ResultDependency_type"),
				 FrameWebPackage.Literals.RESULT_DEPENDENCY__TARGET_FORM_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ResultDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResultDependency"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResultDependency)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ResultDependency_type") :
			getString("_UI_ResultDependency_type") + " " + label;
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

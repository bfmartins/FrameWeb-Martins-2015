/**
 */
package uml2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.LoopNode;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.LoopNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopNodeItemProvider extends StructuredActivityNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNodeItemProvider(AdapterFactory adapterFactory) {
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

			addBodyOutputPropertyDescriptor(object);
			addBodyPartPropertyDescriptor(object);
			addDeciderPropertyDescriptor(object);
			addIsTestedFirstPropertyDescriptor(object);
			addLoopVariablePropertyDescriptor(object);
			addSetupPartPropertyDescriptor(object);
			addTestPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Body Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoopNode_bodyOutput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoopNode_bodyOutput_feature", "_UI_LoopNode_type"),
				 Uml2Package.Literals.LOOP_NODE__BODY_OUTPUT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Body Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoopNode_bodyPart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoopNode_bodyPart_feature", "_UI_LoopNode_type"),
				 Uml2Package.Literals.LOOP_NODE__BODY_PART,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeciderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoopNode_decider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoopNode_decider_feature", "_UI_LoopNode_type"),
				 Uml2Package.Literals.LOOP_NODE__DECIDER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Tested First feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTestedFirstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoopNode_isTestedFirst_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoopNode_isTestedFirst_feature", "_UI_LoopNode_type"),
				 Uml2Package.Literals.LOOP_NODE__IS_TESTED_FIRST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Loop Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoopNode_loopVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoopNode_loopVariable_feature", "_UI_LoopNode_type"),
				 Uml2Package.Literals.LOOP_NODE__LOOP_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Setup Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetupPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoopNode_setupPart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoopNode_setupPart_feature", "_UI_LoopNode_type"),
				 Uml2Package.Literals.LOOP_NODE__SETUP_PART,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Test feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoopNode_test_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoopNode_test_feature", "_UI_LoopNode_type"),
				 Uml2Package.Literals.LOOP_NODE__TEST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Uml2Package.Literals.LOOP_NODE__LOOP_VARIABLE_INPUT);
			childrenFeatures.add(Uml2Package.Literals.LOOP_NODE__RESULT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LoopNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LoopNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LoopNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LoopNode_type") :
			getString("_UI_LoopNode_type") + " " + label;
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

		switch (notification.getFeatureID(LoopNode.class)) {
			case Uml2Package.LOOP_NODE__IS_TESTED_FIRST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
			case Uml2Package.LOOP_NODE__RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.LOOP_NODE__LOOP_VARIABLE_INPUT,
				 Uml2Factory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.LOOP_NODE__LOOP_VARIABLE_INPUT,
				 Uml2Factory.eINSTANCE.createActionInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.LOOP_NODE__LOOP_VARIABLE_INPUT,
				 Uml2Factory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.LOOP_NODE__RESULT,
				 Uml2Factory.eINSTANCE.createOutputPin()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Uml2Package.Literals.ACTION__LOCAL_POSTCONDITION ||
			childFeature == Uml2Package.Literals.ACTION__LOCAL_PRECONDITION ||
			childFeature == Uml2Package.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT ||
			childFeature == Uml2Package.Literals.LOOP_NODE__LOOP_VARIABLE_INPUT ||
			childFeature == Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT ||
			childFeature == Uml2Package.Literals.LOOP_NODE__RESULT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

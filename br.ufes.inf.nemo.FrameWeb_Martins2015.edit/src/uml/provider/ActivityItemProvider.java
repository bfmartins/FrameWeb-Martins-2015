/**
 */
package uml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link uml.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends BehaviorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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

			addNodePropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addIsReadOnlyPropertyDescriptor(object);
			addIsSingleExecutionPropertyDescriptor(object);
			addPartitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_node_feature", "_UI_Activity_type"),
				 UmlPackage.Literals.ACTIVITY__NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_group_feature", "_UI_Activity_type"),
				 UmlPackage.Literals.ACTIVITY__GROUP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_isReadOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_isReadOnly_feature", "_UI_Activity_type"),
				 UmlPackage.Literals.ACTIVITY__IS_READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Single Execution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSingleExecutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_isSingleExecution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_isSingleExecution_feature", "_UI_Activity_type"),
				 UmlPackage.Literals.ACTIVITY__IS_SINGLE_EXECUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Partition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_partition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_partition_feature", "_UI_Activity_type"),
				 UmlPackage.Literals.ACTIVITY__PARTITION,
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
			childrenFeatures.add(UmlPackage.Literals.ACTIVITY__OWNED_GROUP);
			childrenFeatures.add(UmlPackage.Literals.ACTIVITY__EDGE);
			childrenFeatures.add(UmlPackage.Literals.ACTIVITY__VARIABLE);
			childrenFeatures.add(UmlPackage.Literals.ACTIVITY__OWNED_NODE);
			childrenFeatures.add(UmlPackage.Literals.ACTIVITY__STRUCTURED_NODE);
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
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Activity_type") :
			getString("_UI_Activity_type") + " " + label;
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

		switch (notification.getFeatureID(Activity.class)) {
			case UmlPackage.ACTIVITY__IS_READ_ONLY:
			case UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UmlPackage.ACTIVITY__OWNED_GROUP:
			case UmlPackage.ACTIVITY__EDGE:
			case UmlPackage.ACTIVITY__VARIABLE:
			case UmlPackage.ACTIVITY__OWNED_NODE:
			case UmlPackage.ACTIVITY__STRUCTURED_NODE:
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
				(UmlPackage.Literals.ACTIVITY__OWNED_GROUP,
				 UmlFactory.eINSTANCE.createActivityPartition()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_GROUP,
				 UmlFactory.eINSTANCE.createInterruptibleActivityRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_GROUP,
				 UmlFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_GROUP,
				 UmlFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_GROUP,
				 UmlFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_GROUP,
				 UmlFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_GROUP,
				 UmlFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__EDGE,
				 UmlFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__EDGE,
				 UmlFactory.eINSTANCE.createObjectFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__VARIABLE,
				 UmlFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createActionInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createExpansionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createStartObjectBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createActivityParameterNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createCentralBufferNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createDataStoreNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__OWNED_NODE,
				 UmlFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__STRUCTURED_NODE,
				 UmlFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__STRUCTURED_NODE,
				 UmlFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__STRUCTURED_NODE,
				 UmlFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__STRUCTURED_NODE,
				 UmlFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY__STRUCTURED_NODE,
				 UmlFactory.eINSTANCE.createSequenceNode()));
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
			childFeature == UmlPackage.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == UmlPackage.Literals.CLASS__NESTED_CLASSIFIER ||
			childFeature == UmlPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE ||
			childFeature == UmlPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR ||
			childFeature == UmlPackage.Literals.ACTIVITY__OWNED_GROUP ||
			childFeature == UmlPackage.Literals.ACTIVITY__OWNED_NODE ||
			childFeature == UmlPackage.Literals.ACTIVITY__STRUCTURED_NODE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

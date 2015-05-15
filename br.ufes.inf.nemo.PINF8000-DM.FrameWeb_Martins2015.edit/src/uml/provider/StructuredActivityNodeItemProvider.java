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

import uml.StructuredActivityNode;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.StructuredActivityNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredActivityNodeItemProvider extends ActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNodeItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedMemberPropertyDescriptor(object);
			addImportedMemberPropertyDescriptor(object);
			addMemberPropertyDescriptor(object);
			addContainedEdgePropertyDescriptor(object);
			addContainedNodePropertyDescriptor(object);
			addInActivityPropertyDescriptor(object);
			addSubgroupPropertyDescriptor(object);
			addSuperGroupPropertyDescriptor(object);
			addMustIsolatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_ownedMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_ownedMember_feature", "_UI_Namespace_type"),
				 UmlPackage.Literals.NAMESPACE__OWNED_MEMBER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imported Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_importedMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_importedMember_feature", "_UI_Namespace_type"),
				 UmlPackage.Literals.NAMESPACE__IMPORTED_MEMBER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_member_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_member_feature", "_UI_Namespace_type"),
				 UmlPackage.Literals.NAMESPACE__MEMBER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contained Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_containedEdge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_containedEdge_feature", "_UI_ActivityGroup_type"),
				 UmlPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contained Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_containedNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_containedNode_feature", "_UI_ActivityGroup_type"),
				 UmlPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_inActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_inActivity_feature", "_UI_ActivityGroup_type"),
				 UmlPackage.Literals.ACTIVITY_GROUP__IN_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subgroup feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubgroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_subgroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_subgroup_feature", "_UI_ActivityGroup_type"),
				 UmlPackage.Literals.ACTIVITY_GROUP__SUBGROUP,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityGroup_superGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_superGroup_feature", "_UI_ActivityGroup_type"),
				 UmlPackage.Literals.ACTIVITY_GROUP__SUPER_GROUP,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Must Isolate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMustIsolatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredActivityNode_mustIsolate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredActivityNode_mustIsolate_feature", "_UI_StructuredActivityNode_type"),
				 UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(UmlPackage.Literals.NAMESPACE__OWNED_RULE);
			childrenFeatures.add(UmlPackage.Literals.NAMESPACE__ELEMENT_IMPORT);
			childrenFeatures.add(UmlPackage.Literals.NAMESPACE__PACKAGE_IMPORT);
			childrenFeatures.add(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__EDGE);
			childrenFeatures.add(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
			childrenFeatures.add(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
			childrenFeatures.add(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__VARIABLE);
			childrenFeatures.add(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE);
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
	 * This returns StructuredActivityNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StructuredActivityNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StructuredActivityNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StructuredActivityNode_type") :
			getString("_UI_StructuredActivityNode_type") + " " + label;
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

		switch (notification.getFeatureID(StructuredActivityNode.class)) {
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
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
				(UmlPackage.Literals.NAMESPACE__OWNED_RULE,
				 UmlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.NAMESPACE__OWNED_RULE,
				 UmlFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.NAMESPACE__OWNED_RULE,
				 UmlFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.NAMESPACE__OWNED_RULE,
				 UmlFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.NAMESPACE__OWNED_RULE,
				 UmlFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.NAMESPACE__ELEMENT_IMPORT,
				 UmlFactory.eINSTANCE.createElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.NAMESPACE__PACKAGE_IMPORT,
				 UmlFactory.eINSTANCE.createPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__EDGE,
				 UmlFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__EDGE,
				 UmlFactory.eINSTANCE.createObjectFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT,
				 UmlFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT,
				 UmlFactory.eINSTANCE.createActionInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT,
				 UmlFactory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT,
				 UmlFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__VARIABLE,
				 UmlFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createActionInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createExpansionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createStartObjectBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createActivityParameterNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createCentralBufferNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createDataStoreNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 UmlFactory.eINSTANCE.createMergeNode()));
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
			childFeature == UmlPackage.Literals.ACTION__LOCAL_POSTCONDITION ||
			childFeature == UmlPackage.Literals.ACTION__LOCAL_PRECONDITION ||
			childFeature == UmlPackage.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT ||
			childFeature == UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE ||
			childFeature == UmlPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

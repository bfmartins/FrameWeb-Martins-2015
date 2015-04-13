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

import uml2.StructuredActivityNode;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.StructuredActivityNode} object.
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

			addImportedMemberPropertyDescriptor(object);
			addMemberPropertyDescriptor(object);
			addOwnedMemberPropertyDescriptor(object);
			addContainedNodePropertyDescriptor(object);
			addSubgroupPropertyDescriptor(object);
			addSuperGroupPropertyDescriptor(object);
			addContainedEdgePropertyDescriptor(object);
			addMustIsolatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 Uml2Package.Literals.NAMESPACE__IMPORTED_MEMBER,
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
				 Uml2Package.Literals.NAMESPACE__MEMBER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
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
				 Uml2Package.Literals.NAMESPACE__OWNED_MEMBER,
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
				 Uml2Package.Literals.ACTIVITY_GROUP__CONTAINED_NODE,
				 false,
				 false,
				 false,
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
				 Uml2Package.Literals.ACTIVITY_GROUP__SUBGROUP,
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
				 Uml2Package.Literals.ACTIVITY_GROUP__SUPER_GROUP,
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
				 Uml2Package.Literals.ACTIVITY_GROUP__CONTAINED_EDGE,
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
				 Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(Uml2Package.Literals.NAMESPACE__ELEMENT_IMPORT);
			childrenFeatures.add(Uml2Package.Literals.NAMESPACE__OWNED_RULE);
			childrenFeatures.add(Uml2Package.Literals.NAMESPACE__PACKAGE_IMPORT);
			childrenFeatures.add(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE);
			childrenFeatures.add(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
			childrenFeatures.add(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
			childrenFeatures.add(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__VARIABLE);
			childrenFeatures.add(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__EDGE);
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
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__NODE:
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__EDGE:
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
				(Uml2Package.Literals.NAMESPACE__ELEMENT_IMPORT,
				 Uml2Factory.eINSTANCE.createElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.NAMESPACE__OWNED_RULE,
				 Uml2Factory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.NAMESPACE__OWNED_RULE,
				 Uml2Factory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.NAMESPACE__OWNED_RULE,
				 Uml2Factory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.NAMESPACE__OWNED_RULE,
				 Uml2Factory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.NAMESPACE__OWNED_RULE,
				 Uml2Factory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.NAMESPACE__PACKAGE_IMPORT,
				 Uml2Factory.eINSTANCE.createPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createStartObjectBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__NODE,
				 Uml2Factory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT,
				 Uml2Factory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT,
				 Uml2Factory.eINSTANCE.createActionInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT,
				 Uml2Factory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT,
				 Uml2Factory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__VARIABLE,
				 Uml2Factory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__EDGE,
				 Uml2Factory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE__EDGE,
				 Uml2Factory.eINSTANCE.createObjectFlow()));
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
			childFeature == Uml2Package.Literals.NAMESPACE__OWNED_RULE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

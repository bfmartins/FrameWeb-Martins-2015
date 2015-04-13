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
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.Interaction;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.Interaction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionItemProvider extends BehaviorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionItemProvider(AdapterFactory adapterFactory) {
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

			addCoveredPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Covered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoveredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_covered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_covered_feature", "_UI_InteractionFragment_type"),
				 Uml2Package.Literals.INTERACTION_FRAGMENT__COVERED,
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
			childrenFeatures.add(Uml2Package.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING);
			childrenFeatures.add(Uml2Package.Literals.INTERACTION__ACTION);
			childrenFeatures.add(Uml2Package.Literals.INTERACTION__FORMAL_GATE);
			childrenFeatures.add(Uml2Package.Literals.INTERACTION__FRAGMENT);
			childrenFeatures.add(Uml2Package.Literals.INTERACTION__LIFELINE);
			childrenFeatures.add(Uml2Package.Literals.INTERACTION__MESSAGE);
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
	 * This returns Interaction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interaction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Interaction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Interaction_type") :
			getString("_UI_Interaction_type") + " " + label;
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

		switch (notification.getFeatureID(Interaction.class)) {
			case Uml2Package.INTERACTION__GENERAL_ORDERING:
			case Uml2Package.INTERACTION__ACTION:
			case Uml2Package.INTERACTION__FORMAL_GATE:
			case Uml2Package.INTERACTION__FRAGMENT:
			case Uml2Package.INTERACTION__LIFELINE:
			case Uml2Package.INTERACTION__MESSAGE:
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
				(Uml2Package.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING,
				 Uml2Factory.eINSTANCE.createGeneralOrdering()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createStartObjectBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__ACTION,
				 Uml2Factory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FORMAL_GATE,
				 Uml2Factory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createActionExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createInteractionUse()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createPartDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createInteractionOperand()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createBehaviorExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createConsiderIgnoreFragment()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createContinuation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createMessageOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createDestructionOccurenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createExecutionOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__FRAGMENT,
				 Uml2Factory.eINSTANCE.createStateInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__LIFELINE,
				 Uml2Factory.eINSTANCE.createLifeline()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION__MESSAGE,
				 Uml2Factory.eINSTANCE.createMessage()));
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
			childFeature == Uml2Package.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == Uml2Package.Literals.CLASS__NESTED_CLASSIFIER ||
			childFeature == Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR ||
			childFeature == Uml2Package.Literals.INTERACTION__FRAGMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

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

import uml.State;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.State} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateItemProvider(AdapterFactory adapterFactory) {
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

			addIsLeafPropertyDescriptor(object);
			addRedefinedElementPropertyDescriptor(object);
			addRedefinitionContextPropertyDescriptor(object);
			addIncomingPropertyDescriptor(object);
			addOutgoingPropertyDescriptor(object);
			addIsCompositePropertyDescriptor(object);
			addIsOrthogonalPropertyDescriptor(object);
			addIsSimplePropertyDescriptor(object);
			addIsSubmachineStatePropertyDescriptor(object);
			addRedefinedStatePropertyDescriptor(object);
			addStateInvariantPropertyDescriptor(object);
			addSubmachinePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Leaf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLeafPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_isLeaf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_isLeaf_feature", "_UI_RedefinableElement_type"),
				 UmlPackage.Literals.REDEFINABLE_ELEMENT__IS_LEAF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefined Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_redefinedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_redefinedElement_feature", "_UI_RedefinableElement_type"),
				 UmlPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefinition Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinitionContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_redefinitionContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_redefinitionContext_feature", "_UI_RedefinableElement_type"),
				 UmlPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Vertex_incoming_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Vertex_incoming_feature", "_UI_Vertex_type"),
				 UmlPackage.Literals.VERTEX__INCOMING,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Vertex_outgoing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Vertex_outgoing_feature", "_UI_Vertex_type"),
				 UmlPackage.Literals.VERTEX__OUTGOING,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Composite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCompositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_isComposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_isComposite_feature", "_UI_State_type"),
				 UmlPackage.Literals.STATE__IS_COMPOSITE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Orthogonal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrthogonalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_isOrthogonal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_isOrthogonal_feature", "_UI_State_type"),
				 UmlPackage.Literals.STATE__IS_ORTHOGONAL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Simple feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSimplePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_isSimple_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_isSimple_feature", "_UI_State_type"),
				 UmlPackage.Literals.STATE__IS_SIMPLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Submachine State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSubmachineStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_isSubmachineState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_isSubmachineState_feature", "_UI_State_type"),
				 UmlPackage.Literals.STATE__IS_SUBMACHINE_STATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefined State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_redefinedState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_redefinedState_feature", "_UI_State_type"),
				 UmlPackage.Literals.STATE__REDEFINED_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Invariant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateInvariantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_stateInvariant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_stateInvariant_feature", "_UI_State_type"),
				 UmlPackage.Literals.STATE__STATE_INVARIANT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Submachine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubmachinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_submachine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_submachine_feature", "_UI_State_type"),
				 UmlPackage.Literals.STATE__SUBMACHINE,
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
			childrenFeatures.add(UmlPackage.Literals.STATE__CONNECTION);
			childrenFeatures.add(UmlPackage.Literals.STATE__CONNECTION_POINT);
			childrenFeatures.add(UmlPackage.Literals.STATE__DEFERRABLE_TRIGGER);
			childrenFeatures.add(UmlPackage.Literals.STATE__DO_ACTIVITY);
			childrenFeatures.add(UmlPackage.Literals.STATE__ENTRY);
			childrenFeatures.add(UmlPackage.Literals.STATE__EXIT);
			childrenFeatures.add(UmlPackage.Literals.STATE__REGION);
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
	 * This returns State.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/State"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((State)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_State_type") :
			getString("_UI_State_type") + " " + label;
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

		switch (notification.getFeatureID(State.class)) {
			case UmlPackage.STATE__IS_LEAF:
			case UmlPackage.STATE__IS_COMPOSITE:
			case UmlPackage.STATE__IS_ORTHOGONAL:
			case UmlPackage.STATE__IS_SIMPLE:
			case UmlPackage.STATE__IS_SUBMACHINE_STATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UmlPackage.STATE__CONNECTION:
			case UmlPackage.STATE__CONNECTION_POINT:
			case UmlPackage.STATE__DEFERRABLE_TRIGGER:
			case UmlPackage.STATE__DO_ACTIVITY:
			case UmlPackage.STATE__ENTRY:
			case UmlPackage.STATE__EXIT:
			case UmlPackage.STATE__REGION:
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
				(UmlPackage.Literals.STATE__CONNECTION,
				 UmlFactory.eINSTANCE.createConnectionPointReference()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__CONNECTION_POINT,
				 UmlFactory.eINSTANCE.createPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__DEFERRABLE_TRIGGER,
				 UmlFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__DO_ACTIVITY,
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__DO_ACTIVITY,
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__DO_ACTIVITY,
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__DO_ACTIVITY,
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__DO_ACTIVITY,
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__DO_ACTIVITY,
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__ENTRY,
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__ENTRY,
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__ENTRY,
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__ENTRY,
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__ENTRY,
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__ENTRY,
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__EXIT,
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__EXIT,
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__EXIT,
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__EXIT,
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__EXIT,
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__EXIT,
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.STATE__REGION,
				 UmlFactory.eINSTANCE.createRegion()));
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
			childFeature == UmlPackage.Literals.STATE__DO_ACTIVITY ||
			childFeature == UmlPackage.Literals.STATE__ENTRY ||
			childFeature == UmlPackage.Literals.STATE__EXIT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

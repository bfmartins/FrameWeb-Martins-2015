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
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.InteractionOperand;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.InteractionOperand} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionOperandItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperandItemProvider(AdapterFactory adapterFactory) {
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
				 UmlPackage.Literals.INTERACTION_FRAGMENT__COVERED,
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
			childrenFeatures.add(UmlPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING);
			childrenFeatures.add(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT);
			childrenFeatures.add(UmlPackage.Literals.INTERACTION_OPERAND__GUARD);
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
	 * This returns InteractionOperand.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InteractionOperand"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InteractionOperand)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InteractionOperand_type") :
			getString("_UI_InteractionOperand_type") + " " + label;
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

		switch (notification.getFeatureID(InteractionOperand.class)) {
			case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
			case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
			case UmlPackage.INTERACTION_OPERAND__GUARD:
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
				(UmlPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING,
				 UmlFactory.eINSTANCE.createGeneralOrdering()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createInteractionUse()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createPartDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createInteractionOperand()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createActionExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createBehaviorExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createConsiderIgnoreFragment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createContinuation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createMessageOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createDestructionOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createExecutionOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
				 UmlFactory.eINSTANCE.createStateInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_OPERAND__GUARD,
				 UmlFactory.eINSTANCE.createInteractionConstraint()));
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
			childFeature == UmlPackage.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == UmlPackage.Literals.INTERACTION_OPERAND__GUARD;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

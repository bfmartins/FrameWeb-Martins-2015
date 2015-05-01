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

import uml2.InteractionOperand;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.InteractionOperand} object.
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
			childrenFeatures.add(Uml2Package.Literals.INTERACTION_OPERAND__GUARD);
			childrenFeatures.add(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT);
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
			case Uml2Package.INTERACTION_OPERAND__GENERAL_ORDERING:
			case Uml2Package.INTERACTION_OPERAND__GUARD:
			case Uml2Package.INTERACTION_OPERAND__FRAGMENT:
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
				(Uml2Package.Literals.INTERACTION_OPERAND__GUARD,
				 Uml2Factory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createActionExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createInteractionUse()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createPartDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createInteractionOperand()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createBehaviorExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createConsiderIgnoreFragment()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createContinuation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createMessageOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createDestructionOccurenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createExecutionOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.INTERACTION_OPERAND__FRAGMENT,
				 Uml2Factory.eINSTANCE.createStateInvariant()));
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
			childFeature == Uml2Package.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == Uml2Package.Literals.INTERACTION_OPERAND__GUARD;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

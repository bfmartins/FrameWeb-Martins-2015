/**
 */
package uml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.InteractionConstraint;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.InteractionConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionConstraintItemProvider extends ConstraintItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraintItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT);
			childrenFeatures.add(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT);
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
	 * This returns InteractionConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InteractionConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InteractionConstraint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InteractionConstraint_type") :
			getString("_UI_InteractionConstraint_type") + " " + label;
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

		switch (notification.getFeatureID(InteractionConstraint.class)) {
			case UmlPackage.INTERACTION_CONSTRAINT__MAXINT:
			case UmlPackage.INTERACTION_CONSTRAINT__MININT:
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
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT,
				 UmlFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT,
				 UmlFactory.eINSTANCE.createTimeInterval()));
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
			childFeature == UmlPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION ||
			childFeature == UmlPackage.Literals.CONSTRAINT__SPECIFICATION ||
			childFeature == UmlPackage.Literals.INTERACTION_CONSTRAINT__MAXINT ||
			childFeature == UmlPackage.Literals.INTERACTION_CONSTRAINT__MININT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

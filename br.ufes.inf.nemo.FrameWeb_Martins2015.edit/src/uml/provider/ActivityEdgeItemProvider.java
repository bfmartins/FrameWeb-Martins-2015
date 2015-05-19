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

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link uml.ActivityEdge} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityEdgeItemProvider extends RedefinableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeItemProvider(AdapterFactory adapterFactory) {
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

			addInPartitionPropertyDescriptor(object);
			addInterruptsPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addRedefinedEdgePropertyDescriptor(object);
			addInGroupPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the In Partition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInPartitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityEdge_inPartition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityEdge_inPartition_feature", "_UI_ActivityEdge_type"),
				 UmlPackage.Literals.ACTIVITY_EDGE__IN_PARTITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interrupts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterruptsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityEdge_interrupts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityEdge_interrupts_feature", "_UI_ActivityEdge_type"),
				 UmlPackage.Literals.ACTIVITY_EDGE__INTERRUPTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityEdge_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityEdge_target_feature", "_UI_ActivityEdge_type"),
				 UmlPackage.Literals.ACTIVITY_EDGE__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityEdge_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityEdge_source_feature", "_UI_ActivityEdge_type"),
				 UmlPackage.Literals.ACTIVITY_EDGE__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefined Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityEdge_redefinedEdge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityEdge_redefinedEdge_feature", "_UI_ActivityEdge_type"),
				 UmlPackage.Literals.ACTIVITY_EDGE__REDEFINED_EDGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityEdge_inGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityEdge_inGroup_feature", "_UI_ActivityEdge_type"),
				 UmlPackage.Literals.ACTIVITY_EDGE__IN_GROUP,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(UmlPackage.Literals.ACTIVITY_EDGE__GUARD);
			childrenFeatures.add(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActivityEdge)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ActivityEdge_type") :
			getString("_UI_ActivityEdge_type") + " " + label;
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

		switch (notification.getFeatureID(ActivityEdge.class)) {
			case UmlPackage.ACTIVITY_EDGE__GUARD:
			case UmlPackage.ACTIVITY_EDGE__WEIGHT:
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
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__GUARD,
				 UmlFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT,
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
			childFeature == UmlPackage.Literals.ACTIVITY_EDGE__GUARD ||
			childFeature == UmlPackage.Literals.ACTIVITY_EDGE__WEIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

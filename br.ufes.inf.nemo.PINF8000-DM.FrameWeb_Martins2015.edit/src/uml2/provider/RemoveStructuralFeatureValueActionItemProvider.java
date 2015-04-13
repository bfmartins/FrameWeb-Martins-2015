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

import uml2.RemoveStructuralFeatureValueAction;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.RemoveStructuralFeatureValueAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveStructuralFeatureValueActionItemProvider extends WriteStructuralFeatureActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStructuralFeatureValueActionItemProvider(AdapterFactory adapterFactory) {
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

			addIsRemoveDuplicatesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Remove Duplicates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRemoveDuplicatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoveStructuralFeatureValueAction_isRemoveDuplicates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoveStructuralFeatureValueAction_isRemoveDuplicates_feature", "_UI_RemoveStructuralFeatureValueAction_type"),
				 Uml2Package.Literals.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES,
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
			childrenFeatures.add(Uml2Package.Literals.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT);
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
	 * This returns RemoveStructuralFeatureValueAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RemoveStructuralFeatureValueAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RemoveStructuralFeatureValueAction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RemoveStructuralFeatureValueAction_type") :
			getString("_UI_RemoveStructuralFeatureValueAction_type") + " " + label;
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

		switch (notification.getFeatureID(RemoveStructuralFeatureValueAction.class)) {
			case Uml2Package.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Uml2Package.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT:
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
				(Uml2Package.Literals.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
				 Uml2Factory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
				 Uml2Factory.eINSTANCE.createActionInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT,
				 Uml2Factory.eINSTANCE.createValuePin()));
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
			childFeature == Uml2Package.Literals.STRUCTURAL_FEATURE_ACTION__OBJECT ||
			childFeature == Uml2Package.Literals.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE ||
			childFeature == Uml2Package.Literals.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

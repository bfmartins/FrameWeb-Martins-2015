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

import uml2.Namespace;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.Namespace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespaceItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceItemProvider(AdapterFactory adapterFactory) {
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
		String label = ((Namespace)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Namespace_type") :
			getString("_UI_Namespace_type") + " " + label;
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

		switch (notification.getFeatureID(Namespace.class)) {
			case Uml2Package.NAMESPACE__ELEMENT_IMPORT:
			case Uml2Package.NAMESPACE__OWNED_RULE:
			case Uml2Package.NAMESPACE__PACKAGE_IMPORT:
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
	}

}

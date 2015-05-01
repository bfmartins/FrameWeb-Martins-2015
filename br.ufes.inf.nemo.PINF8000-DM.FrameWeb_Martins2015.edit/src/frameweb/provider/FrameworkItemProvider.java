/**
 */
package frameweb.provider;


import frameweb.FramewebFactory;
import frameweb.FramewebPackage;
import frameweb.Framework;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.Uml2Package;

import uml2.provider.PackageItemProvider;

/**
 * This is the item provider adapter for a {@link frameweb.Framework} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameworkItemProvider extends PackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_TAG_LIB);
			childrenFeatures.add(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_RULE);
			childrenFeatures.add(FramewebPackage.Literals.FRAMEWORK__NEW_EREFERENCE);
			childrenFeatures.add(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_ANOTATION);
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
	 * This returns Framework.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Framework"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Framework)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Framework_type") :
			getString("_UI_Framework_type") + " " + label;
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

		switch (notification.getFeatureID(Framework.class)) {
			case FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB:
			case FramewebPackage.FRAMEWORK__FRAMEWORK_RULE:
			case FramewebPackage.FRAMEWORK__NEW_EREFERENCE:
			case FramewebPackage.FRAMEWORK__FRAMEWORK_ANOTATION:
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
				(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_TAG_LIB,
				 FramewebFactory.eINSTANCE.createTagLib()));

		newChildDescriptors.add
			(createChildParameter
				(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_RULE,
				 FramewebFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(FramewebPackage.Literals.FRAMEWORK__NEW_EREFERENCE,
				 FramewebFactory.eINSTANCE.createTalvez_Method()));

		newChildDescriptors.add
			(createChildParameter
				(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_ANOTATION,
				 FramewebFactory.eINSTANCE.createAnotation()));
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
			childFeature == Uml2Package.Literals.NAMED_ELEMENT__NAME_EXPRESSION ||
			childFeature == Uml2Package.Literals.PACKAGE__PACKAGED_ELEMENT ||
			childFeature == Uml2Package.Literals.NAMESPACE__OWNED_RULE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FrameWeb_Martins2015EditPlugin.INSTANCE;
	}

}

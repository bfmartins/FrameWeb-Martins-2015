/**
 */
package frameweb.provider;


import frameweb.FrameWebFactory;
import frameweb.FrameWebPackage;
import frameweb.ViewPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link frameweb.ViewPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewPackageItemProvider extends NavigationPackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FrameWebPackage.Literals.VIEW_PACKAGE__VIEW_PACKAGE_CLASS);
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
	 * This returns ViewPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ViewPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ViewPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ViewPackage_type") :
			getString("_UI_ViewPackage_type") + " " + label;
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

		switch (notification.getFeatureID(ViewPackage.class)) {
			case FrameWebPackage.VIEW_PACKAGE__VIEW_PACKAGE_CLASS:
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
				(FrameWebPackage.Literals.VIEW_PACKAGE__VIEW_PACKAGE_CLASS,
				 FrameWebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.VIEW_PACKAGE__VIEW_PACKAGE_CLASS,
				 FrameWebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.VIEW_PACKAGE__VIEW_PACKAGE_CLASS,
				 FrameWebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.VIEW_PACKAGE__VIEW_PACKAGE_CLASS,
				 FrameWebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.VIEW_PACKAGE__VIEW_PACKAGE_CLASS,
				 FrameWebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.VIEW_PACKAGE__VIEW_PACKAGE_CLASS,
				 FrameWebFactory.eINSTANCE.createJQuery()));
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
			childFeature == Uml2Package.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == FrameWebPackage.Literals.VIEW_PACKAGE__VIEW_PACKAGE_CLASS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

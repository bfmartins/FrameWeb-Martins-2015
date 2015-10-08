/**
 */
package frameweb.provider;


import frameweb.FramewebFactory;
import frameweb.FramewebPackage;
import frameweb.NavigationAssociation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.AssociationItemProvider;

/**
 * This is the item provider adapter for a {@link frameweb.NavigationAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationAssociationItemProvider extends AssociationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationAssociationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FramewebPackage.Literals.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY);
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
	 * This returns NavigationAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NavigationAssociation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NavigationAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NavigationAssociation_type") :
			getString("_UI_NavigationAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(NavigationAssociation.class)) {
			case FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY:
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
				(UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION,
				 FramewebFactory.eINSTANCE.createPageConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION,
				 FramewebFactory.eINSTANCE.createResultConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION,
				 FramewebFactory.eINSTANCE.createMethodCosntraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION,
				 FramewebFactory.eINSTANCE.createChainingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createDAOGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createServiceGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createDomainGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add
			(createChildParameter
				(FramewebPackage.Literals.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY,
				 FramewebFactory.eINSTANCE.createNavigationCompositionPart()));
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
			childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE ||
			childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION ||
			childFeature == UMLPackage.Literals.ASSOCIATION__OWNED_END ||
			childFeature == UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END ||
			childFeature == FramewebPackage.Literals.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY;

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
		return FrameWebEditPlugin.INSTANCE;
	}

}

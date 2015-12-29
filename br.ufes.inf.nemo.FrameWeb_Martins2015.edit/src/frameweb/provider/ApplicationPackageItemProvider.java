/**
 */
package frameweb.provider;


import frameweb.ApplicationPackage;
import frameweb.FramewebFactory;
import frameweb.FramewebPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.PackageItemProvider;

/**
 * This is the item provider adapter for a {@link frameweb.ApplicationPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationPackageItemProvider extends PackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FramewebPackage.Literals.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS);
			childrenFeatures.add(FramewebPackage.Literals.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE);
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
	 * This returns ApplicationPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApplicationPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ApplicationPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ApplicationPackage_type") :
			getString("_UI_ApplicationPackage_type") + " " + label;
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

		switch (notification.getFeatureID(ApplicationPackage.class)) {
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS:
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE:
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
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createPageConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createResultConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createMethodCosntraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createChainingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createDomainConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createFramework()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createNavigationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createApplicationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createPersistenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createViewPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createControllerPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createPersistencePackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createApplicationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createTagLib()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createResultSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createMappingSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createDomainClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createUIComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createResultType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createClassMappingKind()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createAttributeMappingKind()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFramework()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createNavigationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createApplicationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAORealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createResultDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrontControllerDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPageDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createChainingDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createViewPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createControllerPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistencePackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createApplicationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createUIComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createResultType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTagLib()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createResultSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPageConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createResultConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createMethodCosntraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createChainingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createMappingSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createClassMappingKind()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createAttributeMappingKind()));

		newChildDescriptors.add
			(createChildParameter
				(FramewebPackage.Literals.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(FramewebPackage.Literals.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE,
				 FramewebFactory.eINSTANCE.createServiceInterface()));
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
			childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION ||
			childFeature == UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT ||
			childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == UMLPackage.Literals.PACKAGE__NESTED_PACKAGE ||
			childFeature == UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE ||
			childFeature == UMLPackage.Literals.PACKAGE__OWNED_TYPE ||
			childFeature == FramewebPackage.Literals.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS ||
			childFeature == FramewebPackage.Literals.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE;

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

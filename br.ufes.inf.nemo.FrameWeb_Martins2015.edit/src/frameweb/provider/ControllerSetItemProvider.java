/**
 */
package frameweb.provider;


import frameweb.ControllerSet;
import frameweb.FramewebFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.PackageItemProvider;

/**
 * This is the item provider adapter for a {@link frameweb.ControllerSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerSetItemProvider extends PackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerSetItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns ControllerSet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControllerSet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ControllerSet)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ControllerSet_type") :
			getString("_UI_ControllerSet_type") + " " + label;
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
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

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
				 FramewebFactory.eINSTANCE.createFrameworkProfile()));

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
				 FramewebFactory.eINSTANCE.createMappingLib()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 FramewebFactory.eINSTANCE.createControllerSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE,
				 FramewebFactory.eINSTANCE.createResultType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE,
				 FramewebFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE,
				 FramewebFactory.eINSTANCE.createClassMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE,
				 FramewebFactory.eINSTANCE.createAttributeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE,
				 FramewebFactory.eINSTANCE.createController()));

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
				 FramewebFactory.eINSTANCE.createClassMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createAttributeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createTagExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createControllerExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createResultExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createClassMappingExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 FramewebFactory.eINSTANCE.createAttributeMappingExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrameworkProfile()));

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
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

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
				 FramewebFactory.eINSTANCE.createMappingLib()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createClassMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createAttributeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTagExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createControllerExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createControllerSet()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createResultExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createClassMappingExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createAttributeMappingExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PROFILE_APPLICATION,
				 FramewebFactory.eINSTANCE.createFramework()));
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
			childFeature == UMLPackage.Literals.PACKAGE__OWNED_TYPE;

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

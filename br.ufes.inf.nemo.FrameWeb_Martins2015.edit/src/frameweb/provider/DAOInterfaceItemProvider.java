/**
 */
package frameweb.provider;


import frameweb.DAOInterface;
import frameweb.FramewebFactory;
import frameweb.FramewebPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.InterfaceItemProvider;

/**
 * This is the item provider adapter for a {@link frameweb.DAOInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DAOInterfaceItemProvider extends InterfaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addDAOInterfaceNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the DAO Interface Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDAOInterfaceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DAOInterface_DAOInterfaceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DAOInterface_DAOInterfaceName_feature", "_UI_DAOInterface_type"),
				 FramewebPackage.Literals.DAO_INTERFACE__DAO_INTERFACE_NAME,
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
			childrenFeatures.add(FramewebPackage.Literals.DAO_INTERFACE__OWN_BASE_OPERATION);
			childrenFeatures.add(FramewebPackage.Literals.DAO_INTERFACE__OWN_OPERATION);
			childrenFeatures.add(FramewebPackage.Literals.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE);
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
	 * This returns DAOInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DAOInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DAOInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DAOInterface_type") :
			getString("_UI_DAOInterface_type") + " " + label;
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

		switch (notification.getFeatureID(DAOInterface.class)) {
			case FramewebPackage.DAO_INTERFACE__OWN_BASE_OPERATION:
			case FramewebPackage.DAO_INTERFACE__OWN_OPERATION:
			case FramewebPackage.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE:
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
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTransientClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createResultType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createNavigationCompositionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDomainOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDAOOperation()));

		newChildDescriptors.add
			(createChildParameter
				(FramewebPackage.Literals.DAO_INTERFACE__OWN_BASE_OPERATION,
				 FramewebFactory.eINSTANCE.createDAOBaseOperation()));

		newChildDescriptors.add
			(createChildParameter
				(FramewebPackage.Literals.DAO_INTERFACE__OWN_OPERATION,
				 FramewebFactory.eINSTANCE.createDAOOperation()));

		newChildDescriptors.add
			(createChildParameter
				(FramewebPackage.Literals.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));
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
			childFeature == UMLPackage.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER ||
			childFeature == UMLPackage.Literals.INTERFACE__PROTOCOL ||
			childFeature == UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE ||
			childFeature == FramewebPackage.Literals.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE ||
			childFeature == UMLPackage.Literals.INTERFACE__OWNED_OPERATION ||
			childFeature == FramewebPackage.Literals.DAO_INTERFACE__OWN_OPERATION;

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

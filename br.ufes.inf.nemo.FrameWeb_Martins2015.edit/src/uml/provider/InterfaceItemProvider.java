/**
 */
package uml.provider;


import frameweb.FramewebFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.Interface;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.Interface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceItemProvider extends ClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addRedefinedInterfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Redefined Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_redefinedInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_redefinedInterface_feature", "_UI_Interface_type"),
				 UmlPackage.Literals.INTERFACE__REDEFINED_INTERFACE,
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
			childrenFeatures.add(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER);
			childrenFeatures.add(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE);
			childrenFeatures.add(UmlPackage.Literals.INTERFACE__OWNED_RECEPTION);
			childrenFeatures.add(UmlPackage.Literals.INTERFACE__PROTOCOL);
			childrenFeatures.add(UmlPackage.Literals.INTERFACE__OWNED_OPERATION);
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
	 * This returns Interface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Interface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Interface_type") :
			getString("_UI_Interface_type") + " " + label;
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

		switch (notification.getFeatureID(Interface.class)) {
			case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
			case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
			case UmlPackage.INTERFACE__OWNED_RECEPTION:
			case UmlPackage.INTERFACE__PROTOCOL:
			case UmlPackage.INTERFACE__OWNED_OPERATION:
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
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UmlFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTransientClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createFrameworkTag()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 UmlFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 UmlFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 UmlFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_RECEPTION,
				 UmlFactory.eINSTANCE.createReception()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__PROTOCOL,
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_OPERATION,
				 UmlFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDomainOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDAOOperation()));
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
			childFeature == UmlPackage.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == UmlPackage.Literals.INTERFACE__NESTED_CLASSIFIER ||
			childFeature == UmlPackage.Literals.INTERFACE__PROTOCOL ||
			childFeature == UmlPackage.Literals.INTERFACE__OWNED_ATTRIBUTE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

/**
 */
package uml2.provider;


import frameweb.FramewebFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider extends EncapsulatedClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassItemProvider(AdapterFactory adapterFactory) {
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

			addClassifierBehaviorPropertyDescriptor(object);
			addExtensionPropertyDescriptor(object);
			addIsActivePropertyDescriptor(object);
			addSuperClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Classifier Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehavioredClassifier_classifierBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_classifierBehavior_feature", "_UI_BehavioredClassifier_type"),
				 Uml2Package.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_extension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_extension_feature", "_UI_Class_type"),
				 Uml2Package.Literals.CLASS__EXTENSION,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_isActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_isActive_feature", "_UI_Class_type"),
				 Uml2Package.Literals.CLASS__IS_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_superClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_superClass_feature", "_UI_Class_type"),
				 Uml2Package.Literals.CLASS__SUPER_CLASS,
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
			childrenFeatures.add(Uml2Package.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
			childrenFeatures.add(Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
			childrenFeatures.add(Uml2Package.Literals.CLASS__OWNED_OPERATION);
			childrenFeatures.add(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER);
			childrenFeatures.add(Uml2Package.Literals.CLASS__OWNED_RECEPTION);
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
	 * This returns Class.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Class"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((uml2.Class)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Class_type") :
			getString("_UI_Class_type") + " " + label;
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

		switch (notification.getFeatureID(uml2.Class.class)) {
			case Uml2Package.CLASS__IS_ACTIVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Uml2Package.CLASS__INTERFACE_REALIZATION:
			case Uml2Package.CLASS__OWNED_BEHAVIOR:
			case Uml2Package.CLASS__OWNED_OPERATION:
			case Uml2Package.CLASS__NESTED_CLASSIFIER:
			case Uml2Package.CLASS__OWNED_RECEPTION:
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
				(Uml2Package.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				 Uml2Factory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 Uml2Factory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 Uml2Factory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 Uml2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 Uml2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 Uml2Factory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 Uml2Factory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__OWNED_OPERATION,
				 Uml2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDomainOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDAOOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 Uml2Factory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTransientClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASS__OWNED_RECEPTION,
				 Uml2Factory.eINSTANCE.createReception()));
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
			childFeature == Uml2Package.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == Uml2Package.Literals.CLASS__NESTED_CLASSIFIER ||
			childFeature == Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

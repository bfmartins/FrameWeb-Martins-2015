/**
 */
package frameweb.provider;


import frameweb.FramewebFactory;
import frameweb.FramewebPackage;
import frameweb.VocabularyClass;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link frameweb.VocabularyClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabularyClassItemProvider extends VocabularyEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyClassItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedAttributePropertyDescriptor(object);
			addOwnedConnectorPropertyDescriptor(object);
			addPartPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
			addOwnedPortPropertyDescriptor(object);
			addClassifierBehaviorPropertyDescriptor(object);
			addInterfaceRealizationPropertyDescriptor(object);
			addOwnedBehaviorPropertyDescriptor(object);
			addOwnedOperationPropertyDescriptor(object);
			addExtensionPropertyDescriptor(object);
			addIsActivePropertyDescriptor(object);
			addNestedClassifierPropertyDescriptor(object);
			addOwnedReceptionPropertyDescriptor(object);
			addSuperClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredClassifier_ownedAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredClassifier_ownedAttribute_feature", "_UI_StructuredClassifier_type"),
				 UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Owned Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredClassifier_ownedConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredClassifier_ownedConnector_feature", "_UI_StructuredClassifier_type"),
				 UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredClassifier_part_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredClassifier_part_feature", "_UI_StructuredClassifier_type"),
				 UMLPackage.Literals.STRUCTURED_CLASSIFIER__PART,
				 false,
				 false,
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredClassifier_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredClassifier_role_feature", "_UI_StructuredClassifier_type"),
				 UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Owned Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EncapsulatedClassifier_ownedPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EncapsulatedClassifier_ownedPort_feature", "_UI_EncapsulatedClassifier_type"),
				 UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
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
				 UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Realization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceRealizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehavioredClassifier_interfaceRealization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_interfaceRealization_feature", "_UI_BehavioredClassifier_type"),
				 UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Owned Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehavioredClassifier_ownedBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_ownedBehavior_feature", "_UI_BehavioredClassifier_type"),
				 UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Owned Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_ownedOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_ownedOperation_feature", "_UI_Class_type"),
				 UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
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
				 UMLPackage.Literals.CLASS__EXTENSION,
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
				 UMLPackage.Literals.CLASS__IS_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nested Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestedClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_nestedClassifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_nestedClassifier_feature", "_UI_Class_type"),
				 UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Owned Reception feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedReceptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_ownedReception_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_ownedReception_feature", "_UI_Class_type"),
				 UMLPackage.Literals.CLASS__OWNED_RECEPTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
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
				 UMLPackage.Literals.CLASS__SUPER_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
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
			childrenFeatures.add(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
			childrenFeatures.add(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
			childrenFeatures.add(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
			childrenFeatures.add(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
			childrenFeatures.add(UMLPackage.Literals.CLASS__OWNED_OPERATION);
			childrenFeatures.add(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER);
			childrenFeatures.add(UMLPackage.Literals.CLASS__OWNED_RECEPTION);
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
	 * This returns VocabularyClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VocabularyClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VocabularyClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VocabularyClass_type") :
			getString("_UI_VocabularyClass_type") + " " + label;
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

		switch (notification.getFeatureID(VocabularyClass.class)) {
			case FramewebPackage.VOCABULARY_CLASS__OWNED_PORT:
			case FramewebPackage.VOCABULARY_CLASS__CLASSIFIER_BEHAVIOR:
			case FramewebPackage.VOCABULARY_CLASS__IS_ACTIVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FramewebPackage.VOCABULARY_CLASS__OWNED_ATTRIBUTE:
			case FramewebPackage.VOCABULARY_CLASS__OWNED_CONNECTOR:
			case FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION:
			case FramewebPackage.VOCABULARY_CLASS__OWNED_BEHAVIOR:
			case FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION:
			case FramewebPackage.VOCABULARY_CLASS__NESTED_CLASSIFIER:
			case FramewebPackage.VOCABULARY_CLASS__OWNED_RECEPTION:
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
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createControllerExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createTagExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createResultExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createClassMappingExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createAttributeMappingExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createControllerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createTagProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createResultProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createClassMappingPropery()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createAttributeMappingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 UMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 UMLFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR,
				 UMLFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT,
				 UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				 FramewebFactory.eINSTANCE.createDAORealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				 FramewebFactory.eINSTANCE.createSeviceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				 UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDomainMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createServiceMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDAOMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 UMLFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceControllerAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDomainClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createUIComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createResultType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createClassMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAttributeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTagExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createControllerExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createResultExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createClassMappingExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAttributeMappingExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createVocabularyAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAnnotationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createVocabularyDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createVocabularyClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_RECEPTION,
				 UMLFactory.eINSTANCE.createReception()));
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
			childFeature == UMLPackage.Literals.CLASS__NESTED_CLASSIFIER ||
			childFeature == UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE ||
			childFeature == UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT ||
			childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR ||
			childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

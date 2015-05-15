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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addTemplateParameterPropertyDescriptor(object);
			addURIPropertyDescriptor(object);
			addNestedPackagePropertyDescriptor(object);
			addNestingPackagePropertyDescriptor(object);
			addOwnedStereotypePropertyDescriptor(object);
			addOwnedTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Template Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterableElement_templateParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterableElement_templateParameter_feature", "_UI_ParameterableElement_type"),
				 UmlPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_URI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_URI_feature", "_UI_Package_type"),
				 UmlPackage.Literals.PACKAGE__URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nested Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestedPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_nestedPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_nestedPackage_feature", "_UI_Package_type"),
				 UmlPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nesting Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestingPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_nestingPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_nestingPackage_feature", "_UI_Package_type"),
				 UmlPackage.Literals.PACKAGE__NESTING_PACKAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Stereotype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedStereotypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_ownedStereotype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_ownedStereotype_feature", "_UI_Package_type"),
				 UmlPackage.Literals.PACKAGE__OWNED_STEREOTYPE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_ownedType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_ownedType_feature", "_UI_Package_type"),
				 UmlPackage.Literals.PACKAGE__OWNED_TYPE,
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
			childrenFeatures.add(UmlPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);
			childrenFeatures.add(UmlPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
			childrenFeatures.add(UmlPackage.Literals.PACKAGE__PACKAGE_MERGE);
			childrenFeatures.add(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT);
			childrenFeatures.add(UmlPackage.Literals.PACKAGE__PROFILE_APPLICATION);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((uml.Package)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") :
			getString("_UI_Package_type") + " " + label;
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

		switch (notification.getFeatureID(uml.Package.class)) {
			case UmlPackage.PACKAGE__URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UmlPackage.PACKAGE__TEMPLATE_BINDING:
			case UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
			case UmlPackage.PACKAGE__PACKAGE_MERGE:
			case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
			case UmlPackage.PACKAGE__PROFILE_APPLICATION:
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
				(UmlPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING,
				 UmlFactory.eINSTANCE.createTemplateBinding()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
				 UmlFactory.eINSTANCE.createTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
				 UmlFactory.eINSTANCE.createRedefinableTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGE_MERGE,
				 UmlFactory.eINSTANCE.createPackageMerge()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTransientClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFramework()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createNavigationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createApplicationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createResultDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrontControllerDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPageDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createChainingDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createViewPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createControllerPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistencePackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createApplicationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTagLib()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrameworkTag()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.PACKAGE__PROFILE_APPLICATION,
				 UmlFactory.eINSTANCE.createProfileApplication()));
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
			childFeature == UmlPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION ||
			childFeature == UmlPackage.Literals.PACKAGE__PACKAGED_ELEMENT ||
			childFeature == UmlPackage.Literals.NAMESPACE__OWNED_RULE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

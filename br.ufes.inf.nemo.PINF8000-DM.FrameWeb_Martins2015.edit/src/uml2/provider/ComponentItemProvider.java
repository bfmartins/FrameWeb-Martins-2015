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

import uml2.Component;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends ClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addIsIndirectlyInstantiatedPropertyDescriptor(object);
			addProvidedPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Indirectly Instantiated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIndirectlyInstantiatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_isIndirectlyInstantiated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_isIndirectlyInstantiated_feature", "_UI_Component_type"),
				 Uml2Package.Literals.COMPONENT__IS_INDIRECTLY_INSTANTIATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provided feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_provided_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_provided_feature", "_UI_Component_type"),
				 Uml2Package.Literals.COMPONENT__PROVIDED,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_required_feature", "_UI_Component_type"),
				 Uml2Package.Literals.COMPONENT__REQUIRED,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT);
			childrenFeatures.add(Uml2Package.Literals.COMPONENT__REALIZATION);
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") :
			getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
			case Uml2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Uml2Package.COMPONENT__PACKAGED_ELEMENT:
			case Uml2Package.COMPONENT__REALIZATION:
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
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 Uml2Factory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTransientClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFramework()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createNavigationModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createApplicationModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createResultDependency()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrontControllerDependence()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPageDependence()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createChainingDependence()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createViewPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createControllerPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistencePackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createApplicationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT,
				 FramewebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.COMPONENT__REALIZATION,
				 Uml2Factory.eINSTANCE.createComponentRealization()));
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
			childFeature == Uml2Package.Literals.COMPONENT__PACKAGED_ELEMENT ||
			childFeature == Uml2Package.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == Uml2Package.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == Uml2Package.Literals.CLASS__NESTED_CLASSIFIER ||
			childFeature == Uml2Package.Literals.CLASSIFIER__SUBSTITUTION ||
			childFeature == Uml2Package.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION ||
			childFeature == Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR ||
			childFeature == Uml2Package.Literals.COMPONENT__REALIZATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

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

import uml.TemplateParameter;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.TemplateParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultPropertyDescriptor(object);
			addParameteredElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameter_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameter_default_feature", "_UI_TemplateParameter_type"),
				 UmlPackage.Literals.TEMPLATE_PARAMETER__DEFAULT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parametered Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameteredElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameter_parameteredElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameter_parameteredElement_feature", "_UI_TemplateParameter_type"),
				 UmlPackage.Literals.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
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
			childrenFeatures.add(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT);
			childrenFeatures.add(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
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
	 * This returns TemplateParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemplateParameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TemplateParameter_type");
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

		switch (notification.getFeatureID(TemplateParameter.class)) {
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
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
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 UmlFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createTransientClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createFramework()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createNavigationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createApplicationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createPersistenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createResultDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createFrontControllerDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createPageDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createChainingDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDomainOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDAOOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createViewPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createControllerPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createPersistencePackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createApplicationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createTagLib()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				 FramewebFactory.eINSTANCE.createFrameworkTag()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 UmlFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTransientClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFramework()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createNavigationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createApplicationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createResultDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrontControllerDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPageDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createChainingDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDAOOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createViewPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createControllerPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createPersistencePackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createApplicationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createTagLib()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				 FramewebFactory.eINSTANCE.createFrameworkTag()));
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
			childFeature == UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT ||
			childFeature == UmlPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

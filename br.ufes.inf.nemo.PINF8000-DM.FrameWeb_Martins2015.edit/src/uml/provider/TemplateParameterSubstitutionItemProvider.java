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

import uml.TemplateParameterSubstitution;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.TemplateParameterSubstitution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterSubstitutionItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitutionItemProvider(AdapterFactory adapterFactory) {
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

			addActualPropertyDescriptor(object);
			addFormalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Actual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_actual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_actual_feature", "_UI_TemplateParameterSubstitution_type"),
				 UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_formal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_formal_feature", "_UI_TemplateParameterSubstitution_type"),
				 UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL,
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
			childrenFeatures.add(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
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
	 * This returns TemplateParameterSubstitution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemplateParameterSubstitution"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TemplateParameterSubstitution_type");
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

		switch (notification.getFeatureID(TemplateParameterSubstitution.class)) {
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
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
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UmlFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createTransientClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createFramework()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createNavigationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createApplicationModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createPersistenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createResultDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createFrontControllerDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createPageDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createChainingDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDomainOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDAOOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createViewPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createControllerPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createPersistencePackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createApplicationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createTagLib()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FramewebFactory.eINSTANCE.createFrameworkTag()));
	}

}

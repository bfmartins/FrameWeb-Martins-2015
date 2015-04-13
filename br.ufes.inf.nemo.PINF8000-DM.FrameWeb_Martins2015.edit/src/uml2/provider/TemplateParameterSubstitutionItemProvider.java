/**
 */
package uml2.provider;


import frameweb.FrameWebFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.TemplateParameterSubstitution;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.TemplateParameterSubstitution} object.
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
				 Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL,
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
				 Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL,
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
			childrenFeatures.add(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
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
			case Uml2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
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
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 Uml2Factory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createTransientClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createFramework()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createNavigationModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createApplicationModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createPersistenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createResultDependency()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createServiceNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createFrontControllerDependence()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createPageDependence()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createChainingDependence()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDomainOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDAOOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createViewPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createControllerPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createPersistencePackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createApplicationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 FrameWebFactory.eINSTANCE.createFormComponent()));
	}

}

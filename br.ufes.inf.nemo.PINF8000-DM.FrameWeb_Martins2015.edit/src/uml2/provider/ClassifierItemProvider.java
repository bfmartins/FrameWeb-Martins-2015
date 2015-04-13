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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.Classifier;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.Classifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifierItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierItemProvider(AdapterFactory adapterFactory) {
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

			addIsLeafPropertyDescriptor(object);
			addRedefinedElementPropertyDescriptor(object);
			addRedefinitionContextPropertyDescriptor(object);
			addTemplateParameterPropertyDescriptor(object);
			addPackagePropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addGeneralPropertyDescriptor(object);
			addPowertypeExtentPropertyDescriptor(object);
			addInheritedMemberPropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addIsFinalSpecializationPropertyDescriptor(object);
			addUseCasePropertyDescriptor(object);
			addRedefinedClassifierPropertyDescriptor(object);
			addRepresentationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Leaf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLeafPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_isLeaf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_isLeaf_feature", "_UI_RedefinableElement_type"),
				 Uml2Package.Literals.REDEFINABLE_ELEMENT__IS_LEAF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefined Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_redefinedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_redefinedElement_feature", "_UI_RedefinableElement_type"),
				 Uml2Package.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefinition Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinitionContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_redefinitionContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_redefinitionContext_feature", "_UI_RedefinableElement_type"),
				 Uml2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
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
				 Uml2Package.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_package_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_package_feature", "_UI_Type_type"),
				 Uml2Package.Literals.TYPE__PACKAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_attribute_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__ATTRIBUTE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_feature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_feature_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__FEATURE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the General feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_general_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_general_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__GENERAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Powertype Extent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowertypeExtentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_powertypeExtent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_powertypeExtent_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__POWERTYPE_EXTENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_inheritedMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_inheritedMember_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__INHERITED_MEMBER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_isAbstract_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Final Specialization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsFinalSpecializationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_isFinalSpecialization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_isFinalSpecialization_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__IS_FINAL_SPECIALIZATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseCasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_useCase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_useCase_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__USE_CASE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefined Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_redefinedClassifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_redefinedClassifier_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__REDEFINED_CLASSIFIER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Representation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_representation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_representation_feature", "_UI_Classifier_type"),
				 Uml2Package.Literals.CLASSIFIER__REPRESENTATION,
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
			childrenFeatures.add(Uml2Package.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);
			childrenFeatures.add(Uml2Package.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
			childrenFeatures.add(Uml2Package.Literals.CLASSIFIER__COLLABORATION_USE);
			childrenFeatures.add(Uml2Package.Literals.CLASSIFIER__GENERALIZATION);
			childrenFeatures.add(Uml2Package.Literals.CLASSIFIER__OWNED_USE_CASE);
			childrenFeatures.add(Uml2Package.Literals.CLASSIFIER__SUBSTITUTION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Classifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Classifier_type") :
			getString("_UI_Classifier_type") + " " + label;
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

		switch (notification.getFeatureID(Classifier.class)) {
			case Uml2Package.CLASSIFIER__IS_LEAF:
			case Uml2Package.CLASSIFIER__IS_ABSTRACT:
			case Uml2Package.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Uml2Package.CLASSIFIER__TEMPLATE_BINDING:
			case Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
			case Uml2Package.CLASSIFIER__COLLABORATION_USE:
			case Uml2Package.CLASSIFIER__GENERALIZATION:
			case Uml2Package.CLASSIFIER__OWNED_USE_CASE:
			case Uml2Package.CLASSIFIER__SUBSTITUTION:
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
				(Uml2Package.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING,
				 Uml2Factory.eINSTANCE.createTemplateBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
				 Uml2Factory.eINSTANCE.createTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
				 Uml2Factory.eINSTANCE.createRedefinableTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASSIFIER__COLLABORATION_USE,
				 Uml2Factory.eINSTANCE.createCollaborationUse()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASSIFIER__GENERALIZATION,
				 Uml2Factory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASSIFIER__GENERALIZATION,
				 FrameWebFactory.eINSTANCE.createDAOGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASSIFIER__GENERALIZATION,
				 FrameWebFactory.eINSTANCE.createServiceGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASSIFIER__GENERALIZATION,
				 FrameWebFactory.eINSTANCE.createDomainGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASSIFIER__OWNED_USE_CASE,
				 Uml2Factory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.CLASSIFIER__SUBSTITUTION,
				 Uml2Factory.eINSTANCE.createSubstitution()));
	}

}

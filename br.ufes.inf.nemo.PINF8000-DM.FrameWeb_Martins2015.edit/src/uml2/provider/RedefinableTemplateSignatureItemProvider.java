/**
 */
package uml2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.RedefinableTemplateSignature;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.RedefinableTemplateSignature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RedefinableTemplateSignatureItemProvider extends RedefinableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignatureItemProvider(AdapterFactory adapterFactory) {
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

			addParameterPropertyDescriptor(object);
			addExtendedSignaturePropertyDescriptor(object);
			addInheritedParameterPropertyDescriptor(object);
			addClassifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateSignature_parameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateSignature_parameter_feature", "_UI_TemplateSignature_type"),
				 Uml2Package.Literals.TEMPLATE_SIGNATURE__PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extended Signature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedSignaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableTemplateSignature_extendedSignature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableTemplateSignature_extendedSignature_feature", "_UI_RedefinableTemplateSignature_type"),
				 Uml2Package.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableTemplateSignature_inheritedParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableTemplateSignature_inheritedParameter_feature", "_UI_RedefinableTemplateSignature_type"),
				 Uml2Package.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableTemplateSignature_classifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableTemplateSignature_classifier_feature", "_UI_RedefinableTemplateSignature_type"),
				 Uml2Package.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER,
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
			childrenFeatures.add(Uml2Package.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER);
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
	 * This returns RedefinableTemplateSignature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RedefinableTemplateSignature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RedefinableTemplateSignature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RedefinableTemplateSignature_type") :
			getString("_UI_RedefinableTemplateSignature_type") + " " + label;
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

		switch (notification.getFeatureID(RedefinableTemplateSignature.class)) {
			case Uml2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
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
				(Uml2Package.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
				 Uml2Factory.eINSTANCE.createTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
				 Uml2Factory.eINSTANCE.createConnectableElementTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
				 Uml2Factory.eINSTANCE.createOperationTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
				 Uml2Factory.eINSTANCE.createClassifierTemplateParameter()));
	}

}

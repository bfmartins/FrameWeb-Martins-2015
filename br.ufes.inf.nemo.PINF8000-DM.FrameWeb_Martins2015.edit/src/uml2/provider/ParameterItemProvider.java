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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.Parameter;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider extends ConnectableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterItemProvider(AdapterFactory adapterFactory) {
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

			addIsOrderedPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addLowerPropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addDirectionPropertyDescriptor(object);
			addEffectPropertyDescriptor(object);
			addIsExceptionPropertyDescriptor(object);
			addIsStreamPropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
			addParameterSetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_isOrdered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isOrdered_feature", "_UI_MultiplicityElement_type"),
				 Uml2Package.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_isUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isUnique_feature", "_UI_MultiplicityElement_type"),
				 Uml2Package.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_lower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lower_feature", "_UI_MultiplicityElement_type"),
				 Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_upper_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upper_feature", "_UI_MultiplicityElement_type"),
				 Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Parameter_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_default_feature", "_UI_Parameter_type"),
				 Uml2Package.Literals.PARAMETER__DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_direction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_direction_feature", "_UI_Parameter_type"),
				 Uml2Package.Literals.PARAMETER__DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_effect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_effect_feature", "_UI_Parameter_type"),
				 Uml2Package.Literals.PARAMETER__EFFECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Exception feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExceptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_isException_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_isException_feature", "_UI_Parameter_type"),
				 Uml2Package.Literals.PARAMETER__IS_EXCEPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Stream feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStreamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_isStream_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_isStream_feature", "_UI_Parameter_type"),
				 Uml2Package.Literals.PARAMETER__IS_STREAM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_operation_feature", "_UI_Parameter_type"),
				 Uml2Package.Literals.PARAMETER__OPERATION,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_parameterSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_parameterSet_feature", "_UI_Parameter_type"),
				 Uml2Package.Literals.PARAMETER__PARAMETER_SET,
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
			childrenFeatures.add(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE);
			childrenFeatures.add(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE);
			childrenFeatures.add(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE);
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
	 * This returns Parameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Parameter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Parameter_type") :
			getString("_UI_Parameter_type") + " " + label;
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

		switch (notification.getFeatureID(Parameter.class)) {
			case Uml2Package.PARAMETER__IS_ORDERED:
			case Uml2Package.PARAMETER__IS_UNIQUE:
			case Uml2Package.PARAMETER__LOWER:
			case Uml2Package.PARAMETER__UPPER:
			case Uml2Package.PARAMETER__DEFAULT:
			case Uml2Package.PARAMETER__DIRECTION:
			case Uml2Package.PARAMETER__EFFECT:
			case Uml2Package.PARAMETER__IS_EXCEPTION:
			case Uml2Package.PARAMETER__IS_STREAM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Uml2Package.PARAMETER__LOWER_VALUE:
			case Uml2Package.PARAMETER__UPPER_VALUE:
			case Uml2Package.PARAMETER__DEFAULT_VALUE:
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
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 Uml2Factory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 Uml2Factory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.PARAMETER__DEFAULT_VALUE,
				 Uml2Factory.eINSTANCE.createTimeExpression()));
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
			childFeature == Uml2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE ||
			childFeature == Uml2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE ||
			childFeature == Uml2Package.Literals.PARAMETER__DEFAULT_VALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

/**
 */
package uml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link uml.ActionInputPin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionInputPinItemProvider extends InputPinItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInputPinItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION);
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
	 * This returns ActionInputPin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActionInputPin"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActionInputPin)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ActionInputPin_type") :
			getString("_UI_ActionInputPin_type") + " " + label;
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

		switch (notification.getFeatureID(ActionInputPin.class)) {
			case UmlPackage.ACTION_INPUT_PIN__FROM_ACTION:
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
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createStartObjectBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
				 UmlFactory.eINSTANCE.createUnmarshallAction()));
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
			childFeature == UmlPackage.Literals.OBJECT_NODE__UPPER_BOUND ||
			childFeature == UmlPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE ||
			childFeature == UmlPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

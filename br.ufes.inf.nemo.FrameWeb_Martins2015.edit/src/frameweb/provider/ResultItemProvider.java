/**
 */
package frameweb.provider;


import frameweb.ResultType;
import frameweb.FramewebFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.ClassItemProvider;

/**
 * This is the item provider adapter for a {@link ResultType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultItemProvider extends ClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns Result.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Result"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResultType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Result_type") :
			getString("_UI_Result_type") + " " + label;
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
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createDAOGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createServiceGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createDomainGeneralization()));

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
				 FramewebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createBinaryAttribute()));

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
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createNavigationCompositionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createNavigationComposition()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDomainOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDAOOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createMappedClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createPersistentClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTransientClass()));

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
				 FramewebFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createBinary()));

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
				 FramewebFactory.eINSTANCE.createServiceNavigationAssociation()));

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
				 FramewebFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createResultType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createJQuery()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTag()));
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FrameWebEditPlugin.INSTANCE;
	}

}

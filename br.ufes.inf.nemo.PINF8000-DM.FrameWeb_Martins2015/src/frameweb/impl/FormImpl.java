/**
 */
package frameweb.impl;

import frameweb.Form;
import frameweb.FormComponent;
import frameweb.FramewebPackage;
import frameweb.Tag;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FormImpl#getSubTag <em>Sub Tag</em>}</li>
 *   <li>{@link frameweb.impl.FormImpl#getFormClassAttribute <em>Form Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends NavigationClassImpl implements Form {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getSubTag() {
		return (EList<Tag>)eGet(FramewebPackage.Literals.TAG__SUB_TAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FormComponent> getFormClassAttribute() {
		return (EList<FormComponent>)eGet(FramewebPackage.Literals.FORM__FORM_CLASS_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Tag.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.FORM__SUB_TAG: return FramewebPackage.TAG__SUB_TAG;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Tag.class) {
			switch (baseFeatureID) {
				case FramewebPackage.TAG__SUB_TAG: return FramewebPackage.FORM__SUB_TAG;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FormImpl

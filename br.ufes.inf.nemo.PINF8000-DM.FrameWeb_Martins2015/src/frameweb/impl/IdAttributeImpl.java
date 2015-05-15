/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.Generation;
import frameweb.IdAttribute;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.IdAttributeImpl#getGeneration <em>Generation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdAttributeImpl extends DomainAttributeImpl implements IdAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.ID_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation getGeneration() {
		return (Generation)eGet(FramewebPackage.Literals.ID_ATTRIBUTE__GENERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneration(Generation newGeneration) {
		eSet(FramewebPackage.Literals.ID_ATTRIBUTE__GENERATION, newGeneration);
	}

} //IdAttributeImpl

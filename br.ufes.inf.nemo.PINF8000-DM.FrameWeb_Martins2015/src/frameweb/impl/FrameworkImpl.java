/**
 */
package frameweb.impl;

import frameweb.Anotation;
import frameweb.FramewebPackage;
import frameweb.Framework;
import frameweb.Rule;
import frameweb.TagLib;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrameworkImpl#getFrameworkTagLib <em>Framework Tag Lib</em>}</li>
 *   <li>{@link frameweb.impl.FrameworkImpl#getFrameworkRule <em>Framework Rule</em>}</li>
 *   <li>{@link frameweb.impl.FrameworkImpl#getFrameworkAnotation <em>Framework Anotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameworkImpl extends PackageImpl implements Framework {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 28;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagLib getFrameworkTagLib() {
		return (TagLib)eGet(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_TAG_LIB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameworkTagLib(TagLib newFrameworkTagLib) {
		eSet(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_TAG_LIB, newFrameworkTagLib);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Rule> getFrameworkRule() {
		return (EList<Rule>)eGet(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Anotation> getFrameworkAnotation() {
		return (EList<Anotation>)eGet(FramewebPackage.Literals.FRAMEWORK__FRAMEWORK_ANOTATION, true);
	}

} //FrameworkImpl

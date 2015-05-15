/**
 */
package frameweb.impl;

import frameweb.DomainClass;
import frameweb.DomainGeneralization;
import frameweb.FramewebPackage;
import frameweb.InheritanceMapping;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.GeneralizationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainGeneralizationImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link frameweb.impl.DomainGeneralizationImpl#getTargetDomain <em>Target Domain</em>}</li>
 *   <li>{@link frameweb.impl.DomainGeneralizationImpl#getSourceDomain <em>Source Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainGeneralizationImpl extends GeneralizationImpl implements DomainGeneralization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 11;

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
	public InheritanceMapping getMapping() {
		return (InheritanceMapping)eGet(FramewebPackage.Literals.DOMAIN_GENERALIZATION__MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(InheritanceMapping newMapping) {
		eSet(FramewebPackage.Literals.DOMAIN_GENERALIZATION__MAPPING, newMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass getTargetDomain() {
		return (DomainClass)eGet(FramewebPackage.Literals.DOMAIN_GENERALIZATION__TARGET_DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDomain(DomainClass newTargetDomain) {
		eSet(FramewebPackage.Literals.DOMAIN_GENERALIZATION__TARGET_DOMAIN, newTargetDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass getSourceDomain() {
		return (DomainClass)eGet(FramewebPackage.Literals.DOMAIN_GENERALIZATION__SOURCE_DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDomain(DomainClass newSourceDomain) {
		eSet(FramewebPackage.Literals.DOMAIN_GENERALIZATION__SOURCE_DOMAIN, newSourceDomain);
	}

} //DomainGeneralizationImpl

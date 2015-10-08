/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.ResultSet;
import frameweb.ResultType;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ResultSetImpl#getSetOfResultType <em>Set Of Result Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultSetImpl extends PackageImpl implements ResultSet {
	/**
	 * The cached value of the '{@link #getSetOfResultType() <em>Set Of Result Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetOfResultType()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultType> setOfResultType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.RESULT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultType> getSetOfResultType() {
		if (setOfResultType == null) {
			setOfResultType = new EObjectContainmentEList<ResultType>(ResultType.class, this, FramewebPackage.RESULT_SET__SET_OF_RESULT_TYPE);
		}
		return setOfResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.RESULT_SET__SET_OF_RESULT_TYPE:
				return ((InternalEList<?>)getSetOfResultType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.RESULT_SET__SET_OF_RESULT_TYPE:
				return getSetOfResultType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.RESULT_SET__SET_OF_RESULT_TYPE:
				getSetOfResultType().clear();
				getSetOfResultType().addAll((Collection<? extends ResultType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FramewebPackage.RESULT_SET__SET_OF_RESULT_TYPE:
				getSetOfResultType().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FramewebPackage.RESULT_SET__SET_OF_RESULT_TYPE:
				return setOfResultType != null && !setOfResultType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultSetImpl

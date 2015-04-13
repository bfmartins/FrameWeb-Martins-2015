/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.Constraint;
import uml2.DataType;
import uml2.Interface;
import uml2.Operation;
import uml2.Parameter;
import uml2.ParameterableElement;
import uml2.TemplateBinding;
import uml2.TemplateParameter;
import uml2.TemplateSignature;
import uml2.TemplateableElement;
import uml2.Type;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.OperationImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getIsQuery <em>Is Query</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getRedefinedOperation <em>Redefined Operation</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link uml2.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BehavioralFeatureImpl implements Operation {
	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter;

	/**
	 * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBinding;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getBodyCondition() <em>Body Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint bodyCondition;

	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = Boolean.FALSE;

	/**
	 * The default value of the '{@link #getIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsQuery()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_QUERY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsQuery()
	 * @generated
	 * @ordered
	 */
	protected Boolean isQuery = IS_QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIQUE_EDEFAULT = Boolean.TRUE;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> postcondition;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> precondition;

	/**
	 * The cached value of the '{@link #getRedefinedOperation() <em>Redefined Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> redefinedOperation;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_EDEFAULT = new Integer(1);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER) return null;
		return (TemplateParameter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject)newOwningTemplateParameter).eInverseAdd(this, Uml2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, Uml2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, Uml2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, Uml2Package.OPERATION__TEMPLATE_BINDING, Uml2Package.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, Uml2Package.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, Uml2Package.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBodyCondition() {
		if (bodyCondition != null && bodyCondition.eIsProxy()) {
			InternalEObject oldBodyCondition = (InternalEObject)bodyCondition;
			bodyCondition = (Constraint)eResolveProxy(oldBodyCondition);
			if (bodyCondition != oldBodyCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.OPERATION__BODY_CONDITION, oldBodyCondition, bodyCondition));
			}
		}
		return bodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetBodyCondition() {
		return bodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyCondition(Constraint newBodyCondition) {
		Constraint oldBodyCondition = bodyCondition;
		bodyCondition = newBodyCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__BODY_CONDITION, oldBodyCondition, bodyCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2.Class getClass_() {
		if (eContainerFeatureID() != Uml2Package.OPERATION__CLASS) return null;
		return (uml2.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(uml2.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, Uml2Package.OPERATION__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(uml2.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != Uml2Package.OPERATION__CLASS && newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, Uml2Package.CLASS__OWNED_OPERATION, uml2.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (eContainerFeatureID() != Uml2Package.OPERATION__DATATYPE) return null;
		return (DataType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DataType newDatatype, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDatatype, Uml2Package.OPERATION__DATATYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eInternalContainer() || (eContainerFeatureID() != Uml2Package.OPERATION__DATATYPE && newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, Uml2Package.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (eContainerFeatureID() != Uml2Package.OPERATION__INTERFACE) return null;
		return (Interface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterface, Uml2Package.OPERATION__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		if (newInterface != eInternalContainer() || (eContainerFeatureID() != Uml2Package.OPERATION__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, Uml2Package.INTERFACE__OWNED_OPERATION, Interface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		// TODO: implement this method to return the 'Is Ordered' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsQuery() {
		return isQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(Boolean newIsQuery) {
		Boolean oldIsQuery = isQuery;
		isQuery = newIsQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.OPERATION__IS_QUERY, oldIsQuery, isQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUnique() {
		// TODO: implement this method to return the 'Is Unique' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLower() {
		// TODO: implement this method to return the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, Uml2Package.OPERATION__POSTCONDITION);
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, Uml2Package.OPERATION__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getRedefinedOperation() {
		if (redefinedOperation == null) {
			redefinedOperation = new EObjectResolvingEList<Operation>(Operation.class, this, Uml2Package.OPERATION__REDEFINED_OPERATION);
		}
		return redefinedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		Type type = basicGetType();
		return type != null && type.eIsProxy() ? (Type)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpper() {
		// TODO: implement this method to return the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean onlyBodyForQuery(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.OPERATION__ONLY_BODY_FOR_QUERY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "onlyBodyForQuery", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean atMostOneReturn(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.OPERATION__AT_MOST_ONE_RETURN,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "atMostOneReturn", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isOrdered() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isUnique() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer lower() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> returnResult() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type type() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer upper() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isTemplate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> parameterableElements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isCompatibleWith(ParameterableElement p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isTemplateParameter() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
			case Uml2Package.OPERATION__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, Uml2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case Uml2Package.OPERATION__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
			case Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case Uml2Package.OPERATION__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((uml2.Class)otherEnd, msgs);
			case Uml2Package.OPERATION__DATATYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatatype((DataType)otherEnd, msgs);
			case Uml2Package.OPERATION__INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface((Interface)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER:
				return basicSetOwningTemplateParameter(null, msgs);
			case Uml2Package.OPERATION__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case Uml2Package.OPERATION__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case Uml2Package.OPERATION__CLASS:
				return basicSetClass(null, msgs);
			case Uml2Package.OPERATION__DATATYPE:
				return basicSetDatatype(null, msgs);
			case Uml2Package.OPERATION__INTERFACE:
				return basicSetInterface(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER:
				return eInternalContainer().eInverseRemove(this, Uml2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case Uml2Package.OPERATION__CLASS:
				return eInternalContainer().eInverseRemove(this, Uml2Package.CLASS__OWNED_OPERATION, uml2.Class.class, msgs);
			case Uml2Package.OPERATION__DATATYPE:
				return eInternalContainer().eInverseRemove(this, Uml2Package.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
			case Uml2Package.OPERATION__INTERFACE:
				return eInternalContainer().eInverseRemove(this, Uml2Package.INTERFACE__OWNED_OPERATION, Interface.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case Uml2Package.OPERATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case Uml2Package.OPERATION__TEMPLATE_BINDING:
				return getTemplateBinding();
			case Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case Uml2Package.OPERATION__BODY_CONDITION:
				if (resolve) return getBodyCondition();
				return basicGetBodyCondition();
			case Uml2Package.OPERATION__CLASS:
				return getClass_();
			case Uml2Package.OPERATION__DATATYPE:
				return getDatatype();
			case Uml2Package.OPERATION__INTERFACE:
				return getInterface();
			case Uml2Package.OPERATION__IS_ORDERED:
				return getIsOrdered();
			case Uml2Package.OPERATION__IS_QUERY:
				return getIsQuery();
			case Uml2Package.OPERATION__IS_UNIQUE:
				return getIsUnique();
			case Uml2Package.OPERATION__LOWER:
				return getLower();
			case Uml2Package.OPERATION__POSTCONDITION:
				return getPostcondition();
			case Uml2Package.OPERATION__PRECONDITION:
				return getPrecondition();
			case Uml2Package.OPERATION__REDEFINED_OPERATION:
				return getRedefinedOperation();
			case Uml2Package.OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case Uml2Package.OPERATION__UPPER:
				return getUpper();
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
			case Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case Uml2Package.OPERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case Uml2Package.OPERATION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case Uml2Package.OPERATION__BODY_CONDITION:
				setBodyCondition((Constraint)newValue);
				return;
			case Uml2Package.OPERATION__CLASS:
				setClass((uml2.Class)newValue);
				return;
			case Uml2Package.OPERATION__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case Uml2Package.OPERATION__INTERFACE:
				setInterface((Interface)newValue);
				return;
			case Uml2Package.OPERATION__IS_QUERY:
				setIsQuery((Boolean)newValue);
				return;
			case Uml2Package.OPERATION__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Uml2Package.OPERATION__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Uml2Package.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperation().clear();
				getRedefinedOperation().addAll((Collection<? extends Operation>)newValue);
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
			case Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case Uml2Package.OPERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case Uml2Package.OPERATION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case Uml2Package.OPERATION__BODY_CONDITION:
				setBodyCondition((Constraint)null);
				return;
			case Uml2Package.OPERATION__CLASS:
				setClass((uml2.Class)null);
				return;
			case Uml2Package.OPERATION__DATATYPE:
				setDatatype((DataType)null);
				return;
			case Uml2Package.OPERATION__INTERFACE:
				setInterface((Interface)null);
				return;
			case Uml2Package.OPERATION__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case Uml2Package.OPERATION__POSTCONDITION:
				getPostcondition().clear();
				return;
			case Uml2Package.OPERATION__PRECONDITION:
				getPrecondition().clear();
				return;
			case Uml2Package.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperation().clear();
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
			case Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter() != null;
			case Uml2Package.OPERATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case Uml2Package.OPERATION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case Uml2Package.OPERATION__BODY_CONDITION:
				return bodyCondition != null;
			case Uml2Package.OPERATION__CLASS:
				return getClass_() != null;
			case Uml2Package.OPERATION__DATATYPE:
				return getDatatype() != null;
			case Uml2Package.OPERATION__INTERFACE:
				return getInterface() != null;
			case Uml2Package.OPERATION__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? getIsOrdered() != null : !IS_ORDERED_EDEFAULT.equals(getIsOrdered());
			case Uml2Package.OPERATION__IS_QUERY:
				return IS_QUERY_EDEFAULT == null ? isQuery != null : !IS_QUERY_EDEFAULT.equals(isQuery);
			case Uml2Package.OPERATION__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? getIsUnique() != null : !IS_UNIQUE_EDEFAULT.equals(getIsUnique());
			case Uml2Package.OPERATION__LOWER:
				return LOWER_EDEFAULT == null ? getLower() != null : !LOWER_EDEFAULT.equals(getLower());
			case Uml2Package.OPERATION__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case Uml2Package.OPERATION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case Uml2Package.OPERATION__REDEFINED_OPERATION:
				return redefinedOperation != null && !redefinedOperation.isEmpty();
			case Uml2Package.OPERATION__TYPE:
				return basicGetType() != null;
			case Uml2Package.OPERATION__UPPER:
				return UPPER_EDEFAULT == null ? getUpper() != null : !UPPER_EDEFAULT.equals(getUpper());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER: return Uml2Package.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case Uml2Package.OPERATION__TEMPLATE_PARAMETER: return Uml2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case Uml2Package.OPERATION__TEMPLATE_BINDING: return Uml2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE: return Uml2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case Uml2Package.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return Uml2Package.OPERATION__OWNING_TEMPLATE_PARAMETER;
				case Uml2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return Uml2Package.OPERATION__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case Uml2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return Uml2Package.OPERATION__TEMPLATE_BINDING;
				case Uml2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return Uml2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case Uml2Package.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return Uml2Package.OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case Uml2Package.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return Uml2Package.OPERATION___IS_TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case Uml2Package.TEMPLATEABLE_ELEMENT___IS_TEMPLATE: return Uml2Package.OPERATION___IS_TEMPLATE;
				case Uml2Package.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS: return Uml2Package.OPERATION___PARAMETERABLE_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Uml2Package.OPERATION___ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP:
				return onlyBodyForQuery((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.OPERATION___AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP:
				return atMostOneReturn((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.OPERATION___IS_ORDERED:
				return isOrdered();
			case Uml2Package.OPERATION___IS_UNIQUE:
				return isUnique();
			case Uml2Package.OPERATION___LOWER:
				return lower();
			case Uml2Package.OPERATION___RETURN_RESULT:
				return returnResult();
			case Uml2Package.OPERATION___TYPE:
				return type();
			case Uml2Package.OPERATION___UPPER:
				return upper();
			case Uml2Package.OPERATION___IS_TEMPLATE:
				return isTemplate();
			case Uml2Package.OPERATION___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
			case Uml2Package.OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return isCompatibleWith((ParameterableElement)arguments.get(0));
			case Uml2Package.OPERATION___IS_TEMPLATE_PARAMETER:
				return isTemplateParameter();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isQuery: ");
		result.append(isQuery);
		result.append(')');
		return result.toString();
	}

} //OperationImpl

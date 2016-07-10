/**
 */
package frameweb.impl;

import frameweb.Association;
import frameweb.FramewebPackage;
import frameweb.Individual;
import frameweb.NamedIndividual;
import frameweb.Property;
import frameweb.util.FramewebValidator;

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
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#isStatic <em>Is Static</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getType <em>Type</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getEnds <em>End</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getDeployedElements <em>Deployed Element</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#isIsID <em>Is ID</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link frameweb.impl.NamedIndividualImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedIndividualImpl extends VocabularyEntityImpl implements NamedIndividual {
	/**
	 * The default value of the '{@link #isStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployments;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected DataType datatype;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_EDEFAULT = AggregationKind.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> qualifier;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification defaultValue;

	/**
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_UNION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsID()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsID()
	 * @generated
	 * @ordered
	 */
	protected boolean isID = IS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedProperty() <em>Redefined Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> redefinedProperty;

	/**
	 * The cached value of the '{@link #getSubsettedProperty() <em>Subsetted Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> subsettedProperty;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedIndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.NAMED_INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getFeaturingClassifiers() {
		// TODO: implement this method to return the 'Featuring Classifier' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAMED_INDIVIDUAL__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		// TODO: implement this method to return the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		// TODO: implement this method to set the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		if (lowerValue != null && lowerValue.eIsProxy()) {
			InternalEObject oldLowerValue = (InternalEObject)lowerValue;
			lowerValue = (ValueSpecification)eResolveProxy(oldLowerValue);
			if (lowerValue != oldLowerValue) {
				InternalEObject newLowerValue = (InternalEObject)lowerValue;
				NotificationChain msgs = oldLowerValue.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE, null, null);
				if (newLowerValue.eInternalContainer() == null) {
					msgs = newLowerValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE, oldLowerValue, lowerValue));
			}
		}
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		// TODO: implement this method to return the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		// TODO: implement this method to set the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		if (upperValue != null && upperValue.eIsProxy()) {
			InternalEObject oldUpperValue = (InternalEObject)upperValue;
			upperValue = (ValueSpecification)eResolveProxy(oldUpperValue);
			if (upperValue != oldUpperValue) {
				InternalEObject newUpperValue = (InternalEObject)upperValue;
				NotificationChain msgs = oldUpperValue.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE, null, null);
				if (newUpperValue.eInternalContainer() == null) {
					msgs = newUpperValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE, oldUpperValue, upperValue));
			}
		}
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnds() {
		// TODO: implement this method to return the 'End' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getDeployedElements() {
		// TODO: implement this method to return the 'Deployed Element' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployments() {
		if (deployments == null) {
			deployments = new EObjectContainmentWithInverseEList.Resolving<Deployment>(Deployment.class, this, FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT, UMLPackage.DEPLOYMENT__LOCATION);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (DataType)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAMED_INDIVIDUAL__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		DataType oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (Interface)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAMED_INDIVIDUAL__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		// TODO: implement this method to return the 'Default' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		// TODO: implement this method to set the 'Default' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefault() {
		// TODO: implement this method to unset the 'Default' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefault() {
		// TODO: implement this method to return whether the 'Default' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(AggregationKind newAggregation) {
		AggregationKind oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAssociationEnd() {
		if (eContainerFeatureID() != FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END) return null;
		return (Property)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationEnd(Property newAssociationEnd, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssociationEnd, FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Property newAssociationEnd) {
		if (newAssociationEnd != eInternalContainer() || (eContainerFeatureID() != FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END && newAssociationEnd != null)) {
			if (EcoreUtil.isAncestor(this, newAssociationEnd))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, FramewebPackage.PROPERTY__QUALIFIER, Property.class, msgs);
			msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END, newAssociationEnd, newAssociationEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentWithInverseEList<Property>(Property.class, this, FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER, FramewebPackage.PROPERTY__ASSOCIATION_END);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getClass_() {
		org.eclipse.uml2.uml.Class class_ = basicGetClass();
		return class_ != null && class_.eIsProxy() ? (org.eclipse.uml2.uml.Class)eResolveProxy((InternalEObject)class_) : class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetClass() {
		// TODO: implement this method to return the 'Class' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
		ValueSpecification oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		// TODO: implement this method to return the 'Is Composite' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		// TODO: implement this method to set the 'Is Composite' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerivedUnion() {
		return isDerivedUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerivedUnion(boolean newIsDerivedUnion) {
		boolean oldIsDerivedUnion = isDerivedUnion;
		isDerivedUnion = newIsDerivedUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsID() {
		return isID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsID(boolean newIsID) {
		boolean oldIsID = isID;
		isID = newIsID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__IS_ID, oldIsID, isID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOpposite() {
		Property opposite = basicGetOpposite();
		return opposite != null && opposite.eIsProxy() ? (Property)eResolveProxy((InternalEObject)opposite) : opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetOpposite() {
		// TODO: implement this method to return the 'Opposite' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Property newOpposite) {
		// TODO: implement this method to set the 'Opposite' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwningAssociation() {
		if (eContainerFeatureID() != FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION) return null;
		return (Association)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningAssociation(Association newOwningAssociation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningAssociation, FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAssociation(Association newOwningAssociation) {
		if (newOwningAssociation != eInternalContainer() || (eContainerFeatureID() != FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION && newOwningAssociation != null)) {
			if (EcoreUtil.isAncestor(this, newOwningAssociation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningAssociation != null)
				msgs = ((InternalEObject)newOwningAssociation).eInverseAdd(this, FramewebPackage.ASSOCIATION__OWNED_END, Association.class, msgs);
			msgs = basicSetOwningAssociation(newOwningAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION, newOwningAssociation, newOwningAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getRedefinedProperty() {
		if (redefinedProperty == null) {
			redefinedProperty = new EObjectResolvingEList<Property>(Property.class, this, FramewebPackage.NAMED_INDIVIDUAL__REDEFINED_PROPERTY);
		}
		return redefinedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getSubsettedProperty() {
		if (subsettedProperty == null) {
			subsettedProperty = new EObjectResolvingEList<Property>(Property.class, this, FramewebPackage.NAMED_INDIVIDUAL__SUBSETTED_PROPERTY);
		}
		return subsettedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION, oldAssociation, newAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		if (newAssociation != association) {
			NotificationChain msgs = null;
			if (association != null)
				msgs = ((InternalEObject)association).eInverseRemove(this, FramewebPackage.ASSOCIATION__MEMBER_END, Association.class, msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject)newAssociation).eInverseAdd(this, FramewebPackage.ASSOCIATION__MEMBER_END, Association.class, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION, newAssociation, newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subsetting_context_conforms(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__SUBSETTING_CONTEXT_CONFORMS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "subsetting_context_conforms", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean derived_union_is_read_only(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__DERIVED_UNION_IS_READ_ONLY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "derived_union_is_read_only", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean multiplicity_of_composite(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__MULTIPLICITY_OF_COMPOSITE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "multiplicity_of_composite", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean redefined_property_inherited(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__REDEFINED_PROPERTY_INHERITED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "redefined_property_inherited", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean subsetting_rules(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__SUBSETTING_RULES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "subsetting_rules", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean binding_to_attribute(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__BINDING_TO_ATTRIBUTE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "binding_to_attribute", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean derived_union_is_derived(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__DERIVED_UNION_IS_DERIVED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "derived_union_is_derived", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean deployment_target(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__DEPLOYMENT_TARGET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deployment_target", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean subsetted_property_names(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__SUBSETTED_PROPERTY_NAMES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "subsetted_property_names", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean type_of_opposite_end(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__TYPE_OF_OPPOSITE_END,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "type_of_opposite_end", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean qualified_is_association_end(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.PROPERTY__QUALIFIED_IS_ASSOCIATION_END,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "qualified_is_association_end", EObjectValidator.getObjectLabel(this, context) }),
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
	public Property getOtherEnd() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanDefaultValue(boolean value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerDefaultValue(int value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(boolean isNavigable) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullDefaultValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealDefaultValue(double value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringDefaultValue(String value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlimitedNaturalDefaultValue(int value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttribute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComposite() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> subsettingContext() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.MULTIPLICITY_ELEMENT__UPPER_GE_LOWER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateUpperGeLower", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.MULTIPLICITY_ELEMENT__LOWER_GE0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateLowerGe0", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateValueSpecificationNoSideEffects(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_NO_SIDE_EFFECTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateValueSpecificationNoSideEffects", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateValueSpecificationConstant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_CONSTANT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateValueSpecificationConstant", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateLowerIsInteger(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.MULTIPLICITY_ELEMENT__LOWER_IS_INTEGER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateLowerIsInteger", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateUpperIsUnlimitedNatural(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.MULTIPLICITY_ELEMENT__UPPER_IS_UNLIMITED_NATURAL,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateUpperIsUnlimitedNatural", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean compatibleWith(MultiplicityElement other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is(int lowerbound, int upperbound) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
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
			case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployments()).basicAdd(otherEnd, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssociationEnd((Property)otherEnd, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualifier()).basicAdd(otherEnd, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningAssociation((Association)otherEnd, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION:
				if (association != null)
					msgs = ((InternalEObject)association).eInverseRemove(this, FramewebPackage.ASSOCIATION__MEMBER_END, Association.class, msgs);
				return basicSetAssociation((Association)otherEnd, msgs);
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
			case FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT:
				return ((InternalEList<?>)getDeployments()).basicRemove(otherEnd, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END:
				return basicSetAssociationEnd(null, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION:
				return basicSetOwningAssociation(null, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION:
				return basicSetAssociation(null, msgs);
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
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END:
				return eInternalContainer().eInverseRemove(this, FramewebPackage.PROPERTY__QUALIFIER, Property.class, msgs);
			case FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION:
				return eInternalContainer().eInverseRemove(this, FramewebPackage.ASSOCIATION__OWNED_END, Association.class, msgs);
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
			case FramewebPackage.NAMED_INDIVIDUAL__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case FramewebPackage.NAMED_INDIVIDUAL__IS_STATIC:
				return isStatic();
			case FramewebPackage.NAMED_INDIVIDUAL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FramewebPackage.NAMED_INDIVIDUAL__IS_ORDERED:
				return isOrdered();
			case FramewebPackage.NAMED_INDIVIDUAL__IS_UNIQUE:
				return isUnique();
			case FramewebPackage.NAMED_INDIVIDUAL__LOWER:
				return getLower();
			case FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE:
				if (resolve) return getLowerValue();
				return basicGetLowerValue();
			case FramewebPackage.NAMED_INDIVIDUAL__UPPER:
				return getUpper();
			case FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE:
				if (resolve) return getUpperValue();
				return basicGetUpperValue();
			case FramewebPackage.NAMED_INDIVIDUAL__IS_READ_ONLY:
				return isReadOnly();
			case FramewebPackage.NAMED_INDIVIDUAL__END:
				return getEnds();
			case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYED_ELEMENT:
				return getDeployedElements();
			case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT:
				return getDeployments();
			case FramewebPackage.NAMED_INDIVIDUAL__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
			case FramewebPackage.NAMED_INDIVIDUAL__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT:
				return getDefault();
			case FramewebPackage.NAMED_INDIVIDUAL__AGGREGATION:
				return getAggregation();
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END:
				return getAssociationEnd();
			case FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER:
				return getQualifier();
			case FramewebPackage.NAMED_INDIVIDUAL__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE:
				return getDefaultValue();
			case FramewebPackage.NAMED_INDIVIDUAL__IS_COMPOSITE:
				return isIsComposite();
			case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED:
				return isIsDerived();
			case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED_UNION:
				return isIsDerivedUnion();
			case FramewebPackage.NAMED_INDIVIDUAL__IS_ID:
				return isIsID();
			case FramewebPackage.NAMED_INDIVIDUAL__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION:
				return getOwningAssociation();
			case FramewebPackage.NAMED_INDIVIDUAL__REDEFINED_PROPERTY:
				return getRedefinedProperty();
			case FramewebPackage.NAMED_INDIVIDUAL__SUBSETTED_PROPERTY:
				return getSubsettedProperty();
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
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
			case FramewebPackage.NAMED_INDIVIDUAL__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__TYPE:
				setType((Type)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__LOWER:
				setLower((Integer)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__UPPER:
				setUpper((Integer)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT:
				getDeployments().clear();
				getDeployments().addAll((Collection<? extends Deployment>)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__INTERFACE:
				setInterface((Interface)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT:
				setDefault((String)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__AGGREGATION:
				setAggregation((AggregationKind)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END:
				setAssociationEnd((Property)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends Property>)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED_UNION:
				setIsDerivedUnion((Boolean)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_ID:
				setIsID((Boolean)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__OPPOSITE:
				setOpposite((Property)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION:
				setOwningAssociation((Association)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__REDEFINED_PROPERTY:
				getRedefinedProperty().clear();
				getRedefinedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				getSubsettedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION:
				setAssociation((Association)newValue);
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
			case FramewebPackage.NAMED_INDIVIDUAL__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__TYPE:
				setType((Type)null);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT:
				getDeployments().clear();
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__DATATYPE:
				setDatatype((DataType)null);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__INTERFACE:
				setInterface((Interface)null);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT:
				unsetDefault();
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END:
				setAssociationEnd((Property)null);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER:
				getQualifier().clear();
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_ID:
				setIsID(IS_ID_EDEFAULT);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__OPPOSITE:
				setOpposite((Property)null);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION:
				setOwningAssociation((Association)null);
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__REDEFINED_PROPERTY:
				getRedefinedProperty().clear();
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				return;
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION:
				setAssociation((Association)null);
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
			case FramewebPackage.NAMED_INDIVIDUAL__FEATURING_CLASSIFIER:
				return !getFeaturingClassifiers().isEmpty();
			case FramewebPackage.NAMED_INDIVIDUAL__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__TYPE:
				return type != null;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE:
				return lowerValue != null;
			case FramewebPackage.NAMED_INDIVIDUAL__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE:
				return upperValue != null;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__END:
				return !getEnds().isEmpty();
			case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
			case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT:
				return deployments != null && !deployments.isEmpty();
			case FramewebPackage.NAMED_INDIVIDUAL__DATATYPE:
				return datatype != null;
			case FramewebPackage.NAMED_INDIVIDUAL__INTERFACE:
				return interface_ != null;
			case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT:
				return isSetDefault();
			case FramewebPackage.NAMED_INDIVIDUAL__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END:
				return getAssociationEnd() != null;
			case FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case FramewebPackage.NAMED_INDIVIDUAL__CLASS:
				return basicGetClass() != null;
			case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE:
				return defaultValue != null;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_COMPOSITE:
				return isIsComposite() != IS_COMPOSITE_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED_UNION:
				return isDerivedUnion != IS_DERIVED_UNION_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__IS_ID:
				return isID != IS_ID_EDEFAULT;
			case FramewebPackage.NAMED_INDIVIDUAL__OPPOSITE:
				return basicGetOpposite() != null;
			case FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION:
				return getOwningAssociation() != null;
			case FramewebPackage.NAMED_INDIVIDUAL__REDEFINED_PROPERTY:
				return redefinedProperty != null && !redefinedProperty.isEmpty();
			case FramewebPackage.NAMED_INDIVIDUAL__SUBSETTED_PROPERTY:
				return subsettedProperty != null && !subsettedProperty.isEmpty();
			case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION:
				return association != null;
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
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.NAMED_INDIVIDUAL__FEATURING_CLASSIFIER: return UMLPackage.FEATURE__FEATURING_CLASSIFIER;
				case FramewebPackage.NAMED_INDIVIDUAL__IS_STATIC: return UMLPackage.FEATURE__IS_STATIC;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.NAMED_INDIVIDUAL__TYPE: return UMLPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.NAMED_INDIVIDUAL__IS_ORDERED: return UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case FramewebPackage.NAMED_INDIVIDUAL__IS_UNIQUE: return UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case FramewebPackage.NAMED_INDIVIDUAL__LOWER: return UMLPackage.MULTIPLICITY_ELEMENT__LOWER;
				case FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE: return UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				case FramewebPackage.NAMED_INDIVIDUAL__UPPER: return UMLPackage.MULTIPLICITY_ELEMENT__UPPER;
				case FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE: return UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				default: return -1;
			}
		}
		if (baseClass == StructuralFeature.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.NAMED_INDIVIDUAL__IS_READ_ONLY: return UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY;
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.NAMED_INDIVIDUAL__END: return UMLPackage.CONNECTABLE_ELEMENT__END;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYED_ELEMENT: return UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
				case FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT: return UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT;
				default: return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.NAMED_INDIVIDUAL__DATATYPE: return FramewebPackage.PROPERTY__DATATYPE;
				case FramewebPackage.NAMED_INDIVIDUAL__INTERFACE: return FramewebPackage.PROPERTY__INTERFACE;
				case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT: return FramewebPackage.PROPERTY__DEFAULT;
				case FramewebPackage.NAMED_INDIVIDUAL__AGGREGATION: return FramewebPackage.PROPERTY__AGGREGATION;
				case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END: return FramewebPackage.PROPERTY__ASSOCIATION_END;
				case FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER: return FramewebPackage.PROPERTY__QUALIFIER;
				case FramewebPackage.NAMED_INDIVIDUAL__CLASS: return FramewebPackage.PROPERTY__CLASS;
				case FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE: return FramewebPackage.PROPERTY__DEFAULT_VALUE;
				case FramewebPackage.NAMED_INDIVIDUAL__IS_COMPOSITE: return FramewebPackage.PROPERTY__IS_COMPOSITE;
				case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED: return FramewebPackage.PROPERTY__IS_DERIVED;
				case FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED_UNION: return FramewebPackage.PROPERTY__IS_DERIVED_UNION;
				case FramewebPackage.NAMED_INDIVIDUAL__IS_ID: return FramewebPackage.PROPERTY__IS_ID;
				case FramewebPackage.NAMED_INDIVIDUAL__OPPOSITE: return FramewebPackage.PROPERTY__OPPOSITE;
				case FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION: return FramewebPackage.PROPERTY__OWNING_ASSOCIATION;
				case FramewebPackage.NAMED_INDIVIDUAL__REDEFINED_PROPERTY: return FramewebPackage.PROPERTY__REDEFINED_PROPERTY;
				case FramewebPackage.NAMED_INDIVIDUAL__SUBSETTED_PROPERTY: return FramewebPackage.PROPERTY__SUBSETTED_PROPERTY;
				case FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION: return FramewebPackage.PROPERTY__ASSOCIATION;
				default: return -1;
			}
		}
		if (baseClass == Individual.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case UMLPackage.FEATURE__FEATURING_CLASSIFIER: return FramewebPackage.NAMED_INDIVIDUAL__FEATURING_CLASSIFIER;
				case UMLPackage.FEATURE__IS_STATIC: return FramewebPackage.NAMED_INDIVIDUAL__IS_STATIC;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPED_ELEMENT__TYPE: return FramewebPackage.NAMED_INDIVIDUAL__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return FramewebPackage.NAMED_INDIVIDUAL__IS_ORDERED;
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return FramewebPackage.NAMED_INDIVIDUAL__IS_UNIQUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER: return FramewebPackage.NAMED_INDIVIDUAL__LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE: return FramewebPackage.NAMED_INDIVIDUAL__LOWER_VALUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER: return FramewebPackage.NAMED_INDIVIDUAL__UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE: return FramewebPackage.NAMED_INDIVIDUAL__UPPER_VALUE;
				default: return -1;
			}
		}
		if (baseClass == StructuralFeature.class) {
			switch (baseFeatureID) {
				case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY: return FramewebPackage.NAMED_INDIVIDUAL__IS_READ_ONLY;
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.CONNECTABLE_ELEMENT__END: return FramewebPackage.NAMED_INDIVIDUAL__END;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return FramewebPackage.NAMED_INDIVIDUAL__DEPLOYED_ELEMENT;
				case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT: return FramewebPackage.NAMED_INDIVIDUAL__DEPLOYMENT;
				default: return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (baseFeatureID) {
				case FramewebPackage.PROPERTY__DATATYPE: return FramewebPackage.NAMED_INDIVIDUAL__DATATYPE;
				case FramewebPackage.PROPERTY__INTERFACE: return FramewebPackage.NAMED_INDIVIDUAL__INTERFACE;
				case FramewebPackage.PROPERTY__DEFAULT: return FramewebPackage.NAMED_INDIVIDUAL__DEFAULT;
				case FramewebPackage.PROPERTY__AGGREGATION: return FramewebPackage.NAMED_INDIVIDUAL__AGGREGATION;
				case FramewebPackage.PROPERTY__ASSOCIATION_END: return FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION_END;
				case FramewebPackage.PROPERTY__QUALIFIER: return FramewebPackage.NAMED_INDIVIDUAL__QUALIFIER;
				case FramewebPackage.PROPERTY__CLASS: return FramewebPackage.NAMED_INDIVIDUAL__CLASS;
				case FramewebPackage.PROPERTY__DEFAULT_VALUE: return FramewebPackage.NAMED_INDIVIDUAL__DEFAULT_VALUE;
				case FramewebPackage.PROPERTY__IS_COMPOSITE: return FramewebPackage.NAMED_INDIVIDUAL__IS_COMPOSITE;
				case FramewebPackage.PROPERTY__IS_DERIVED: return FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED;
				case FramewebPackage.PROPERTY__IS_DERIVED_UNION: return FramewebPackage.NAMED_INDIVIDUAL__IS_DERIVED_UNION;
				case FramewebPackage.PROPERTY__IS_ID: return FramewebPackage.NAMED_INDIVIDUAL__IS_ID;
				case FramewebPackage.PROPERTY__OPPOSITE: return FramewebPackage.NAMED_INDIVIDUAL__OPPOSITE;
				case FramewebPackage.PROPERTY__OWNING_ASSOCIATION: return FramewebPackage.NAMED_INDIVIDUAL__OWNING_ASSOCIATION;
				case FramewebPackage.PROPERTY__REDEFINED_PROPERTY: return FramewebPackage.NAMED_INDIVIDUAL__REDEFINED_PROPERTY;
				case FramewebPackage.PROPERTY__SUBSETTED_PROPERTY: return FramewebPackage.NAMED_INDIVIDUAL__SUBSETTED_PROPERTY;
				case FramewebPackage.PROPERTY__ASSOCIATION: return FramewebPackage.NAMED_INDIVIDUAL__ASSOCIATION;
				default: return -1;
			}
		}
		if (baseClass == Individual.class) {
			switch (baseFeatureID) {
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
		if (baseClass == Feature.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___SET_LOWER__INT: return FramewebPackage.NAMED_INDIVIDUAL___SET_LOWER__INT;
				case UMLPackage.MULTIPLICITY_ELEMENT___SET_UPPER__INT: return FramewebPackage.NAMED_INDIVIDUAL___SET_UPPER__INT;
				case UMLPackage.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT: return FramewebPackage.NAMED_INDIVIDUAL___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
				case UMLPackage.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT: return FramewebPackage.NAMED_INDIVIDUAL___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
				case UMLPackage.MULTIPLICITY_ELEMENT___IS__INT_INT: return FramewebPackage.NAMED_INDIVIDUAL___IS__INT_INT;
				case UMLPackage.MULTIPLICITY_ELEMENT___IS_MULTIVALUED: return FramewebPackage.NAMED_INDIVIDUAL___IS_MULTIVALUED;
				case UMLPackage.MULTIPLICITY_ELEMENT___GET_LOWER: return FramewebPackage.NAMED_INDIVIDUAL___GET_LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT___LOWER_BOUND: return FramewebPackage.NAMED_INDIVIDUAL___LOWER_BOUND;
				case UMLPackage.MULTIPLICITY_ELEMENT___GET_UPPER: return FramewebPackage.NAMED_INDIVIDUAL___GET_UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT___UPPER_BOUND: return FramewebPackage.NAMED_INDIVIDUAL___UPPER_BOUND;
				default: return -1;
			}
		}
		if (baseClass == StructuralFeature.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.CONNECTABLE_ELEMENT___GET_ENDS: return FramewebPackage.NAMED_INDIVIDUAL___GET_ENDS;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseOperationID) {
				case UMLPackage.DEPLOYMENT_TARGET___GET_DEPLOYED_ELEMENTS: return FramewebPackage.NAMED_INDIVIDUAL___GET_DEPLOYED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (baseOperationID) {
				case FramewebPackage.PROPERTY___SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___TYPE_OF_OPPOSITE_END__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___TYPE_OF_OPPOSITE_END__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___QUALIFIED_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP: return FramewebPackage.NAMED_INDIVIDUAL___QUALIFIED_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.PROPERTY___GET_DEFAULT: return FramewebPackage.NAMED_INDIVIDUAL___GET_DEFAULT;
				case FramewebPackage.PROPERTY___GET_OTHER_END: return FramewebPackage.NAMED_INDIVIDUAL___GET_OTHER_END;
				case FramewebPackage.PROPERTY___IS_SET_DEFAULT: return FramewebPackage.NAMED_INDIVIDUAL___IS_SET_DEFAULT;
				case FramewebPackage.PROPERTY___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN: return FramewebPackage.NAMED_INDIVIDUAL___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN;
				case FramewebPackage.PROPERTY___SET_DEFAULT__STRING: return FramewebPackage.NAMED_INDIVIDUAL___SET_DEFAULT__STRING;
				case FramewebPackage.PROPERTY___SET_INTEGER_DEFAULT_VALUE__INT: return FramewebPackage.NAMED_INDIVIDUAL___SET_INTEGER_DEFAULT_VALUE__INT;
				case FramewebPackage.PROPERTY___SET_IS_COMPOSITE__BOOLEAN: return FramewebPackage.NAMED_INDIVIDUAL___SET_IS_COMPOSITE__BOOLEAN;
				case FramewebPackage.PROPERTY___SET_IS_NAVIGABLE__BOOLEAN: return FramewebPackage.NAMED_INDIVIDUAL___SET_IS_NAVIGABLE__BOOLEAN;
				case FramewebPackage.PROPERTY___SET_NULL_DEFAULT_VALUE: return FramewebPackage.NAMED_INDIVIDUAL___SET_NULL_DEFAULT_VALUE;
				case FramewebPackage.PROPERTY___SET_OPPOSITE__PROPERTY: return FramewebPackage.NAMED_INDIVIDUAL___SET_OPPOSITE__PROPERTY;
				case FramewebPackage.PROPERTY___SET_REAL_DEFAULT_VALUE__DOUBLE: return FramewebPackage.NAMED_INDIVIDUAL___SET_REAL_DEFAULT_VALUE__DOUBLE;
				case FramewebPackage.PROPERTY___SET_STRING_DEFAULT_VALUE__STRING: return FramewebPackage.NAMED_INDIVIDUAL___SET_STRING_DEFAULT_VALUE__STRING;
				case FramewebPackage.PROPERTY___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT: return FramewebPackage.NAMED_INDIVIDUAL___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT;
				case FramewebPackage.PROPERTY___UNSET_DEFAULT: return FramewebPackage.NAMED_INDIVIDUAL___UNSET_DEFAULT;
				case FramewebPackage.PROPERTY___IS_ATTRIBUTE: return FramewebPackage.NAMED_INDIVIDUAL___IS_ATTRIBUTE;
				case FramewebPackage.PROPERTY___IS_COMPOSITE: return FramewebPackage.NAMED_INDIVIDUAL___IS_COMPOSITE;
				case FramewebPackage.PROPERTY___IS_NAVIGABLE: return FramewebPackage.NAMED_INDIVIDUAL___IS_NAVIGABLE;
				case FramewebPackage.PROPERTY___GET_OPPOSITE: return FramewebPackage.NAMED_INDIVIDUAL___GET_OPPOSITE;
				case FramewebPackage.PROPERTY___SUBSETTING_CONTEXT: return FramewebPackage.NAMED_INDIVIDUAL___SUBSETTING_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Individual.class) {
			switch (baseOperationID) {
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
			case FramewebPackage.NAMED_INDIVIDUAL___SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP:
				return subsetting_context_conforms((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP:
				return derived_union_is_read_only((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP:
				return multiplicity_of_composite((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP:
				return redefined_property_inherited((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP:
				return subsetting_rules((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP:
				return binding_to_attribute((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP:
				return derived_union_is_derived((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP:
				return deployment_target((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP:
				return subsetted_property_names((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___TYPE_OF_OPPOSITE_END__DIAGNOSTICCHAIN_MAP:
				return type_of_opposite_end((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___QUALIFIED_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP:
				return qualified_is_association_end((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___GET_OTHER_END:
				return getOtherEnd();
			case FramewebPackage.NAMED_INDIVIDUAL___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN:
				setBooleanDefaultValue((Boolean)arguments.get(0));
				return null;
			case FramewebPackage.NAMED_INDIVIDUAL___SET_INTEGER_DEFAULT_VALUE__INT:
				setIntegerDefaultValue((Integer)arguments.get(0));
				return null;
			case FramewebPackage.NAMED_INDIVIDUAL___SET_IS_NAVIGABLE__BOOLEAN:
				setIsNavigable((Boolean)arguments.get(0));
				return null;
			case FramewebPackage.NAMED_INDIVIDUAL___SET_NULL_DEFAULT_VALUE:
				setNullDefaultValue();
				return null;
			case FramewebPackage.NAMED_INDIVIDUAL___SET_REAL_DEFAULT_VALUE__DOUBLE:
				setRealDefaultValue((Double)arguments.get(0));
				return null;
			case FramewebPackage.NAMED_INDIVIDUAL___SET_STRING_DEFAULT_VALUE__STRING:
				setStringDefaultValue((String)arguments.get(0));
				return null;
			case FramewebPackage.NAMED_INDIVIDUAL___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT:
				setUnlimitedNaturalDefaultValue((Integer)arguments.get(0));
				return null;
			case FramewebPackage.NAMED_INDIVIDUAL___IS_ATTRIBUTE:
				return isAttribute();
			case FramewebPackage.NAMED_INDIVIDUAL___IS_COMPOSITE:
				return isComposite();
			case FramewebPackage.NAMED_INDIVIDUAL___IS_NAVIGABLE:
				return isNavigable();
			case FramewebPackage.NAMED_INDIVIDUAL___SUBSETTING_CONTEXT:
				return subsettingContext();
			case FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP:
				return validateUpperGeLower((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP:
				return validateLowerGe0((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP:
				return validateValueSpecificationNoSideEffects((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP:
				return validateValueSpecificationConstant((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP:
				return validateLowerIsInteger((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP:
				return validateUpperIsUnlimitedNatural((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
				return compatibleWith((MultiplicityElement)arguments.get(0));
			case FramewebPackage.NAMED_INDIVIDUAL___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
				return includesMultiplicity((MultiplicityElement)arguments.get(0));
			case FramewebPackage.NAMED_INDIVIDUAL___IS__INT_INT:
				return is((Integer)arguments.get(0), (Integer)arguments.get(1));
			case FramewebPackage.NAMED_INDIVIDUAL___IS_MULTIVALUED:
				return isMultivalued();
			case FramewebPackage.NAMED_INDIVIDUAL___LOWER_BOUND:
				return lowerBound();
			case FramewebPackage.NAMED_INDIVIDUAL___UPPER_BOUND:
				return upperBound();
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
		result.append(" (isStatic: ");
		result.append(isStatic);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", aggregation: ");
		result.append(aggregation);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isDerivedUnion: ");
		result.append(isDerivedUnion);
		result.append(", isID: ");
		result.append(isID);
		result.append(')');
		return result.toString();
	}

	@Override
	public Classifier getFeaturingClassifier(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier getFeaturingClassifier(String name, boolean ignoreCase,
			EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValueSpecification createUpperValue(String name, Type type,
			EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValueSpecification createLowerValue(String name, Type type,
			EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Deployment createDeployment(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Deployment getDeployment(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Deployment getDeployment(String name, boolean ignoreCase,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageableElement getDeployedElement(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageableElement getDeployedElement(String name,
			boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

} //NamedIndividualImpl

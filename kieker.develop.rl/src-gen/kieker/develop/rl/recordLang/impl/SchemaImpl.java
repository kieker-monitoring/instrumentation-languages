/**
 */
package kieker.develop.rl.recordLang.impl;

import java.util.Collection;

import kieker.develop.rl.recordLang.Constant;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordLangPackage;
import kieker.develop.rl.recordLang.RootType;
import kieker.develop.rl.recordLang.Schema;
import kieker.develop.rl.recordLang.TemplateType;
import kieker.develop.rl.recordLang.Templates;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kieker.develop.rl.recordLang.impl.SchemaImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.SchemaImpl#getSince <em>Since</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.SchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.SchemaImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.SchemaImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.SchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.SchemaImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link kieker.develop.rl.recordLang.impl.SchemaImpl#getParents <em>Parents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema
{
  /**
   * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected static final String AUTHOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected String author = AUTHOR_EDEFAULT;

  /**
   * The default value of the '{@link #getSince() <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected static final String SINCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSince() <em>Since</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected String since = SINCE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplates()
   * @generated
   * @ordered
   */
  protected Templates templates;

  /**
   * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected RootType root;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstants()
   * @generated
   * @ordered
   */
  protected EList<Constant> constants;

  /**
   * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParents()
   * @generated
   * @ordered
   */
  protected EList<TemplateType> parents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RecordLangPackage.Literals.SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(String newAuthor)
  {
    String oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.SCHEMA__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSince()
  {
    return since;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSince(String newSince)
  {
    String oldSince = since;
    since = newSince;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.SCHEMA__SINCE, oldSince, since));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.SCHEMA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Templates getTemplates()
  {
    return templates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplates(Templates newTemplates, NotificationChain msgs)
  {
    Templates oldTemplates = templates;
    templates = newTemplates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecordLangPackage.SCHEMA__TEMPLATES, oldTemplates, newTemplates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplates(Templates newTemplates)
  {
    if (newTemplates != templates)
    {
      NotificationChain msgs = null;
      if (templates != null)
        msgs = ((InternalEObject)templates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.SCHEMA__TEMPLATES, null, msgs);
      if (newTemplates != null)
        msgs = ((InternalEObject)newTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.SCHEMA__TEMPLATES, null, msgs);
      msgs = basicSetTemplates(newTemplates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.SCHEMA__TEMPLATES, newTemplates, newTemplates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootType getRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoot(RootType newRoot, NotificationChain msgs)
  {
    RootType oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecordLangPackage.SCHEMA__ROOT, oldRoot, newRoot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(RootType newRoot)
  {
    if (newRoot != root)
    {
      NotificationChain msgs = null;
      if (root != null)
        msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.SCHEMA__ROOT, null, msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecordLangPackage.SCHEMA__ROOT, null, msgs);
      msgs = basicSetRoot(newRoot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordLangPackage.SCHEMA__ROOT, newRoot, newRoot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, RecordLangPackage.SCHEMA__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constant> getConstants()
  {
    if (constants == null)
    {
      constants = new EObjectContainmentEList<Constant>(Constant.class, this, RecordLangPackage.SCHEMA__CONSTANTS);
    }
    return constants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateType> getParents()
  {
    if (parents == null)
    {
      parents = new EObjectResolvingEList<TemplateType>(TemplateType.class, this, RecordLangPackage.SCHEMA__PARENTS);
    }
    return parents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RecordLangPackage.SCHEMA__TEMPLATES:
        return basicSetTemplates(null, msgs);
      case RecordLangPackage.SCHEMA__ROOT:
        return basicSetRoot(null, msgs);
      case RecordLangPackage.SCHEMA__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case RecordLangPackage.SCHEMA__CONSTANTS:
        return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RecordLangPackage.SCHEMA__AUTHOR:
        return getAuthor();
      case RecordLangPackage.SCHEMA__SINCE:
        return getSince();
      case RecordLangPackage.SCHEMA__NAME:
        return getName();
      case RecordLangPackage.SCHEMA__TEMPLATES:
        return getTemplates();
      case RecordLangPackage.SCHEMA__ROOT:
        return getRoot();
      case RecordLangPackage.SCHEMA__PROPERTIES:
        return getProperties();
      case RecordLangPackage.SCHEMA__CONSTANTS:
        return getConstants();
      case RecordLangPackage.SCHEMA__PARENTS:
        return getParents();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RecordLangPackage.SCHEMA__AUTHOR:
        setAuthor((String)newValue);
        return;
      case RecordLangPackage.SCHEMA__SINCE:
        setSince((String)newValue);
        return;
      case RecordLangPackage.SCHEMA__NAME:
        setName((String)newValue);
        return;
      case RecordLangPackage.SCHEMA__TEMPLATES:
        setTemplates((Templates)newValue);
        return;
      case RecordLangPackage.SCHEMA__ROOT:
        setRoot((RootType)newValue);
        return;
      case RecordLangPackage.SCHEMA__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case RecordLangPackage.SCHEMA__CONSTANTS:
        getConstants().clear();
        getConstants().addAll((Collection<? extends Constant>)newValue);
        return;
      case RecordLangPackage.SCHEMA__PARENTS:
        getParents().clear();
        getParents().addAll((Collection<? extends TemplateType>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RecordLangPackage.SCHEMA__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case RecordLangPackage.SCHEMA__SINCE:
        setSince(SINCE_EDEFAULT);
        return;
      case RecordLangPackage.SCHEMA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RecordLangPackage.SCHEMA__TEMPLATES:
        setTemplates((Templates)null);
        return;
      case RecordLangPackage.SCHEMA__ROOT:
        setRoot((RootType)null);
        return;
      case RecordLangPackage.SCHEMA__PROPERTIES:
        getProperties().clear();
        return;
      case RecordLangPackage.SCHEMA__CONSTANTS:
        getConstants().clear();
        return;
      case RecordLangPackage.SCHEMA__PARENTS:
        getParents().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RecordLangPackage.SCHEMA__AUTHOR:
        return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
      case RecordLangPackage.SCHEMA__SINCE:
        return SINCE_EDEFAULT == null ? since != null : !SINCE_EDEFAULT.equals(since);
      case RecordLangPackage.SCHEMA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RecordLangPackage.SCHEMA__TEMPLATES:
        return templates != null;
      case RecordLangPackage.SCHEMA__ROOT:
        return root != null;
      case RecordLangPackage.SCHEMA__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case RecordLangPackage.SCHEMA__CONSTANTS:
        return constants != null && !constants.isEmpty();
      case RecordLangPackage.SCHEMA__PARENTS:
        return parents != null && !parents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (author: ");
    result.append(author);
    result.append(", since: ");
    result.append(since);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SchemaImpl

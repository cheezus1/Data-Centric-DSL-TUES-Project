/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.DidiPackage;
import bg.tues.didi.Expression;
import bg.tues.didi.FunctionCall;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bg.tues.didi.impl.FunctionCallImpl#getCalledFunctionName <em>Called Function Name</em>}</li>
 *   <li>{@link bg.tues.didi.impl.FunctionCallImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionCallImpl extends SimpleStatementImpl implements FunctionCall
{
  /**
   * The default value of the '{@link #getCalledFunctionName() <em>Called Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalledFunctionName()
   * @generated
   * @ordered
   */
  protected static final String CALLED_FUNCTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCalledFunctionName() <em>Called Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalledFunctionName()
   * @generated
   * @ordered
   */
  protected String calledFunctionName = CALLED_FUNCTION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Expression> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionCallImpl()
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
    return DidiPackage.Literals.FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCalledFunctionName()
  {
    return calledFunctionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalledFunctionName(String newCalledFunctionName)
  {
    String oldCalledFunctionName = calledFunctionName;
    calledFunctionName = newCalledFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.FUNCTION_CALL__CALLED_FUNCTION_NAME, oldCalledFunctionName, calledFunctionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<Expression>(Expression.class, this, DidiPackage.FUNCTION_CALL__ARGUMENTS);
    }
    return arguments;
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
      case DidiPackage.FUNCTION_CALL__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case DidiPackage.FUNCTION_CALL__CALLED_FUNCTION_NAME:
        return getCalledFunctionName();
      case DidiPackage.FUNCTION_CALL__ARGUMENTS:
        return getArguments();
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
      case DidiPackage.FUNCTION_CALL__CALLED_FUNCTION_NAME:
        setCalledFunctionName((String)newValue);
        return;
      case DidiPackage.FUNCTION_CALL__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Expression>)newValue);
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
      case DidiPackage.FUNCTION_CALL__CALLED_FUNCTION_NAME:
        setCalledFunctionName(CALLED_FUNCTION_NAME_EDEFAULT);
        return;
      case DidiPackage.FUNCTION_CALL__ARGUMENTS:
        getArguments().clear();
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
      case DidiPackage.FUNCTION_CALL__CALLED_FUNCTION_NAME:
        return CALLED_FUNCTION_NAME_EDEFAULT == null ? calledFunctionName != null : !CALLED_FUNCTION_NAME_EDEFAULT.equals(calledFunctionName);
      case DidiPackage.FUNCTION_CALL__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
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
    result.append(" (calledFunctionName: ");
    result.append(calledFunctionName);
    result.append(')');
    return result.toString();
  }

} //FunctionCallImpl

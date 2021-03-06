/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.DidiPackage;
import bg.tues.didi.PrintArgument;
import bg.tues.didi.PrintFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bg.tues.didi.impl.PrintFunctionImpl#getPrintArgument <em>Print Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintFunctionImpl extends SimpleStatementImpl implements PrintFunction
{
  /**
   * The cached value of the '{@link #getPrintArgument() <em>Print Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrintArgument()
   * @generated
   * @ordered
   */
  protected PrintArgument printArgument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrintFunctionImpl()
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
    return DidiPackage.Literals.PRINT_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintArgument getPrintArgument()
  {
    return printArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrintArgument(PrintArgument newPrintArgument, NotificationChain msgs)
  {
    PrintArgument oldPrintArgument = printArgument;
    printArgument = newPrintArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DidiPackage.PRINT_FUNCTION__PRINT_ARGUMENT, oldPrintArgument, newPrintArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrintArgument(PrintArgument newPrintArgument)
  {
    if (newPrintArgument != printArgument)
    {
      NotificationChain msgs = null;
      if (printArgument != null)
        msgs = ((InternalEObject)printArgument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DidiPackage.PRINT_FUNCTION__PRINT_ARGUMENT, null, msgs);
      if (newPrintArgument != null)
        msgs = ((InternalEObject)newPrintArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DidiPackage.PRINT_FUNCTION__PRINT_ARGUMENT, null, msgs);
      msgs = basicSetPrintArgument(newPrintArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.PRINT_FUNCTION__PRINT_ARGUMENT, newPrintArgument, newPrintArgument));
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
      case DidiPackage.PRINT_FUNCTION__PRINT_ARGUMENT:
        return basicSetPrintArgument(null, msgs);
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
      case DidiPackage.PRINT_FUNCTION__PRINT_ARGUMENT:
        return getPrintArgument();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DidiPackage.PRINT_FUNCTION__PRINT_ARGUMENT:
        setPrintArgument((PrintArgument)newValue);
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
      case DidiPackage.PRINT_FUNCTION__PRINT_ARGUMENT:
        setPrintArgument((PrintArgument)null);
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
      case DidiPackage.PRINT_FUNCTION__PRINT_ARGUMENT:
        return printArgument != null;
    }
    return super.eIsSet(featureID);
  }

} //PrintFunctionImpl

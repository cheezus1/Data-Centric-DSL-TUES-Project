/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.dataCentricDSL.DataCentricDSLFactory
 * @model kind="package"
 * @generated
 */
public interface DataCentricDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dataCentricDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.DataCentricDSL.org";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dataCentricDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataCentricDSLPackage eINSTANCE = org.dataCentricDSL.impl.DataCentricDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.DataCentricDSLImpl <em>Data Centric DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.DataCentricDSLImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getDataCentricDSL()
   * @generated
   */
  int DATA_CENTRIC_DSL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CENTRIC_DSL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Data Centric DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CENTRIC_DSL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableDeclImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableDecl()
   * @generated
   */
  int VARIABLE_DECL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__VALUE = 1;

  /**
   * The number of structural features of the '<em>Variable Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.PrintImpl <em>Print</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.PrintImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPrint()
   * @generated
   */
  int PRINT = 3;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT__PRINT_VALUE = 0;

  /**
   * The number of structural features of the '<em>Print</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.QueryImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 2;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__PRINT_VALUE = PRINT__PRINT_VALUE;

  /**
   * The feature id for the '<em><b>Query Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__QUERY_VALUE = PRINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = PRINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableCallImpl <em>Variable Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableCallImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableCall()
   * @generated
   */
  int VARIABLE_CALL = 4;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__PRINT_VALUE = QUERY__PRINT_VALUE;

  /**
   * The feature id for the '<em><b>Query Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__QUERY_VALUE = QUERY__QUERY_VALUE;

  /**
   * The feature id for the '<em><b>Variable Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__VARIABLE_CALL = QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.DataCentricDSL <em>Data Centric DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Centric DSL</em>'.
   * @see org.dataCentricDSL.DataCentricDSL
   * @generated
   */
  EClass getDataCentricDSL();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.DataCentricDSL#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.dataCentricDSL.DataCentricDSL#getElements()
   * @see #getDataCentricDSL()
   * @generated
   */
  EReference getDataCentricDSL_Elements();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.VariableDecl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Decl</em>'.
   * @see org.dataCentricDSL.VariableDecl
   * @generated
   */
  EClass getVariableDecl();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.dataCentricDSL.VariableDecl#getName()
   * @see #getVariableDecl()
   * @generated
   */
  EAttribute getVariableDecl_Name();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableDecl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.dataCentricDSL.VariableDecl#getValue()
   * @see #getVariableDecl()
   * @generated
   */
  EAttribute getVariableDecl_Value();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see org.dataCentricDSL.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.Query#getQueryValue <em>Query Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query Value</em>'.
   * @see org.dataCentricDSL.Query#getQueryValue()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_QueryValue();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Print <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print</em>'.
   * @see org.dataCentricDSL.Print
   * @generated
   */
  EClass getPrint();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.Print#getPrintValue <em>Print Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Print Value</em>'.
   * @see org.dataCentricDSL.Print#getPrintValue()
   * @see #getPrint()
   * @generated
   */
  EAttribute getPrint_PrintValue();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.VariableCall <em>Variable Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Call</em>'.
   * @see org.dataCentricDSL.VariableCall
   * @generated
   */
  EClass getVariableCall();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableCall#getVariableCall <em>Variable Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Call</em>'.
   * @see org.dataCentricDSL.VariableCall#getVariableCall()
   * @see #getVariableCall()
   * @generated
   */
  EAttribute getVariableCall_VariableCall();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DataCentricDSLFactory getDataCentricDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.DataCentricDSLImpl <em>Data Centric DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.DataCentricDSLImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getDataCentricDSL()
     * @generated
     */
    EClass DATA_CENTRIC_DSL = eINSTANCE.getDataCentricDSL();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CENTRIC_DSL__ELEMENTS = eINSTANCE.getDataCentricDSL_Elements();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.VariableDeclImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableDecl()
     * @generated
     */
    EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL__NAME = eINSTANCE.getVariableDecl_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL__VALUE = eINSTANCE.getVariableDecl_Value();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.QueryImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Query Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__QUERY_VALUE = eINSTANCE.getQuery_QueryValue();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.PrintImpl <em>Print</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.PrintImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPrint()
     * @generated
     */
    EClass PRINT = eINSTANCE.getPrint();

    /**
     * The meta object literal for the '<em><b>Print Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRINT__PRINT_VALUE = eINSTANCE.getPrint_PrintValue();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.VariableCallImpl <em>Variable Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.VariableCallImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableCall()
     * @generated
     */
    EClass VARIABLE_CALL = eINSTANCE.getVariableCall();

    /**
     * The meta object literal for the '<em><b>Variable Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_CALL__VARIABLE_CALL = eINSTANCE.getVariableCall_VariableCall();

  }

} //DataCentricDSLPackage

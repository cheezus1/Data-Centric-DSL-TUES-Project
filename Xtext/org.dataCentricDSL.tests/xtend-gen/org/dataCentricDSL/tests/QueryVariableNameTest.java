package org.dataCentricDSL.tests;

import com.google.inject.Inject;
import org.DataCentricDSLInjectorProvider;
import org.dataCentricDSL.DataCentricDSL;
import org.dataCentricDSL.VariableCall;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(DataCentricDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class QueryVariableNameTest {
  @Inject
  private ParseHelper<DataCentricDSL> parser;
  
  @Test
  public void testQueryVariableName() {
    try {
      final DataCentricDSL model = this.parser.parse(
        "queryString = \"SELECT * FROM parse\";\r\n\t\t\t query queryString;\r\n\t\t\t");
      EList<EObject> _elements = model.getElements();
      EObject _get = _elements.get(1);
      final VariableCall variableCall = ((VariableCall) _get);
      String _variableCall = variableCall.getVariableCall();
      Assert.assertEquals("queryString", _variableCall);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
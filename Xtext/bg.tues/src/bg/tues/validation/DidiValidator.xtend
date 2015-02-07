/*
 * generated by Xtext
 */
package bg.tues.validation

import bg.tues.didi.BooleanValue
import bg.tues.didi.Condition
import bg.tues.didi.ConditionStatement
import bg.tues.didi.DidiModel
import bg.tues.didi.DidiPackage
import bg.tues.didi.ForStatement
import bg.tues.didi.FunctionCall
import bg.tues.didi.FunctionDefinition
import bg.tues.didi.IfStatement
import bg.tues.didi.QueryFunction
import bg.tues.didi.ReturnStatement
import bg.tues.didi.VariableCall
import bg.tues.didi.VariableDefinition
import bg.tues.didi.WhileStatement
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check

import static bg.tues.validation.ValidationUtils.*

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DidiValidator extends AbstractDidiValidator {

	@Check
	def void checkQueryParameter(QueryFunction qf) {
		var expression = qf.queryParam as ConditionStatement;
		var condition = expression.conditions.get(0) as Condition;
		
		if(expression.conditions.length == 1 
			&& condition.conditionElements.length == 1 
			&& !(condition.conditionElements.get(0) instanceof BooleanValue)
		) {
			return;
		}
		
		error(ErrorMessages.QUERY_FUNCTION_PARAMETER_BOOLEAN_EXPRESSION, 
			DidiPackage.Literals::QUERY_FUNCTION__QUERY_PARAM
		);
	}
	
	@Check
	def void validateFunctionDefinition(FunctionDefinition fd) {
		if(!(fd.eContainer instanceof DidiModel)) {
			error(ErrorMessages.FUNCTION_WITHIN_BLOCK_STATEMENT,
				DidiPackage.Literals::FUNCTION_DEFINITION__NAME
			);
			return;
			
		} else {
			if(!ValidationUtils.functionIsDeclaredBeforeTheCode(fd)) {
				error(ErrorMessages.FUNCTIONS_BEGINNING_OF_CODE,
					DidiPackage.Literals::FUNCTION_DEFINITION__NAME
				);
				return;
			}
			
			if(ValidationUtils.functionWithTheSameNameExists(fd)) {
				error(ErrorMessages.FUNCTION_SAME_NAME,
					DidiPackage.Literals::FUNCTION_DEFINITION__NAME
				);
				return;
			}
			
			ValidationUtils.checkIfFunctionIsUsed(fd.eContainer.eContents, fd.name);
	 		if(!ValidationUtils.functionIsUsed) {
	 			warning(ErrorMessages.UNUSED_FUNCTION,
	 				DidiPackage.Literals.FUNCTION_DEFINITION__NAME,
	 				ErrorMessages.UNUSED_FUNCTION,
	 				fd.name
	 			)
	 		}
	 		ValidationUtils.functionIsUsed = false;
		}
	}
	
	@Check
	def void checkConditionElementCompatibility(Condition c) {
 		if(c.conditionElements.length > 1) {
			var leftOperand = c.conditionElements.get(0);
			var rightOperand = c.conditionElements.get(1);
			var errorMessage = ValidationUtils
								.operandsCOmpatibilityErrorMessage(leftOperand,
									rightOperand,
									c.op
								);
			
			if(errorMessage != null) {
				if(errorMessage.contains("operator")) {
					error(errorMessage, 
						DidiPackage.Literals::CONDITION__OP
					);
				} else {
					error(errorMessage, 
						DidiPackage.Literals::CONDITION__CONDITION_ELEMENTS
					);
				}	
			}
		}
	}
	
	@Check
	def void checkIfCalledFunctionExists(FunctionCall fc) {
		var container = ValidationUtils.getDidiModel(fc);
		
		val elements = container.eContents.toArray.filter(typeof(FunctionDefinition));
		if(ValidationUtils.functionIsDeclared(elements, fc.calledFunctionName)) {
			return;
		}
		
		error(ErrorMessages.UNDEFINED_FUNCTION, 
			DidiPackage.Literals::FUNCTION_CALL__CALLED_FUNCTION_NAME,
			ErrorMessages.UNDEFINED_FUNCTION,
			fc.calledFunctionName
		);
	}
	
	@Check
	def void checkIfCalledFunctionArgumentsCountMatches(FunctionCall fc) {
		var container = ValidationUtils.getDidiModel(fc);
		
		var elements = container.eContents.toArray.filter(typeof(FunctionDefinition));
		if(ValidationUtils.functionIsDeclared(elements, fc.calledFunctionName)) {
			for(i : 0..< elements.length) {
				if(elements.get(i).name.equals(fc.calledFunctionName) 
					&& elements.get(i).arguments.length == fc.arguments.length
				) {
					if(!ValidationUtils.functionIsDeclaredBeforeTheCode(elements.get(i))) {
						error(ErrorMessages.UNDEFINED_FUNCTION, 
							DidiPackage.Literals::FUNCTION_CALL__CALLED_FUNCTION_NAME,
							ErrorMessages.UNDEFINED_FUNCTION,
							fc.calledFunctionName
						);
					}
					return;		
				}
			}
			
			error(ErrorMessages.FUNCTION_CALL_ARGUMENTS_MISMATCH,
				DidiPackage.Literals::FUNCTION_CALL__ARGUMENTS
			);
		}
	}
	
	@Check
	def void checkIfAssignedVariableExists(VariableCall vc) {
		var container = vc.eContainer;
		var EObject[] elements = null; 
		var EObject containerElement = vc.eContainer;
		var int containerElementIndex;
		while(!(container instanceof DidiModel)) {
			container = container.eContainer;
			
			if(container instanceof IfStatement || container instanceof ForStatement
				|| container instanceof WhileStatement || container instanceof FunctionDefinition) {
				
				if(container instanceof ForStatement) {
					var DeclaratedVar = (container as ForStatement).forVar;
					if(DeclaratedVar.name.toString.equals(vc.calledVariableName.toString)) {
						return;
					}
				}
				if(container instanceof FunctionDefinition) {
					if(ValidationUtils
						.namePersistsInArray((container as FunctionDefinition).arguments,
							vc.calledVariableName
						)) {
						return;
					}
				}
				containerElementIndex = container.eContents.indexOf(containerElement);
				elements = container.eContents.subList(0, containerElementIndex);
				if(ValidationUtils.variableIsDeclared(elements, vc.calledVariableName)) {
					return;
				}
				elements = null;
			}
			if(!(containerElement.eContainer instanceof DidiModel)) {
				containerElement = containerElement.eContainer;
			}
		}
		containerElementIndex = container.eContents.indexOf(containerElement);
		var variables = container.eContents.subList(0, containerElementIndex).toArray.filter(typeof(VariableDefinition));
		if(ValidationUtils.variableIsDeclared(variables, vc.calledVariableName)) {
			return;
		}
		ValidationUtils.checkIfCalledVariableIsGlobal(container, vc.calledVariableName, containerElementIndex);
		if(!ValidationUtils.globalVariableFound) {
			error(ErrorMessages.UNDEFINED_VARIABLE, 
				DidiPackage.Literals::VARIABLE_CALL__CALLED_VARIABLE_NAME,
				ErrorMessages.UNDEFINED_VARIABLE,
				vc.calledVariableName
			);
		}
		ValidationUtils.globalVariableFound = false;
	}
	
	@Check
	def void checkIfVariableIsUsed(VariableDefinition vd) {
		if(vd.eContainer instanceof ForStatement) {
			if(vd.eContainer.eContents.indexOf(vd) == 1) {
				return;
			}
		}
		var positionInContainer = vd.eContainer.eContents.indexOf(vd) + 1;
		var listFromPosition = vd.eContainer.eContents.subList(positionInContainer, vd.eContainer.eContents.length);
		ValidationUtils.checkIfVariableIsUsed(listFromPosition, vd.name);
		if(!ValidationUtils.variableIsUsed) {
			if(vd.isGlobal) {
				var container = ValidationUtils.getContainerBeforeDidiModel(vd);
				var didiModelElement = container.eContainer;
				positionInContainer = didiModelElement.eContents.indexOf(container) + 1;
				var elementsFromPosition = didiModelElement.eContents.subList(positionInContainer, 
					didiModelElement.eContents.length
				);
				ValidationUtils.checkIfVariableIsUsed(elementsFromPosition, vd.name);
				if(!ValidationUtils.variableIsUsed) {
					warning(ErrorMessages.UNUSED_VARIABLE,
						DidiPackage.Literals.VARIABLE_DEFINITION__NAME,
						ErrorMessages.UNUSED_VARIABLE,
						vd.name
					);
				} else {
					ValidationUtils.variableIsUsed = false;
					positionInContainer = vd.eContainer.eContents.indexOf(vd) + 1;
					listFromPosition = vd.eContainer.eContents.subList(0, positionInContainer);
					ValidationUtils.checkIfVariableIsUsed(listFromPosition, vd.name);
					if(ValidationUtils.variableIsUsed) {
						warning(ErrorMessages.UNUSED_VARIABLE,
							DidiPackage.Literals.VARIABLE_DEFINITION__NAME,
							ErrorMessages.UNUSED_VARIABLE,
							vd.name
						);
					} 
				}
			} else {
				warning(ErrorMessages.UNUSED_VARIABLE,
					DidiPackage.Literals.VARIABLE_DEFINITION__NAME,
					ErrorMessages.UNUSED_VARIABLE,
					vd.name
				);
			}
		}
		ValidationUtils.variableIsUsed = false;
 	}
 	
 	@Check
 	def void validateReturnStatement(ReturnStatement rs) {
 		var container = rs.eContainer;
 		if(!(container instanceof IfStatement) && !(container instanceof ForStatement)
 			&& !(container instanceof WhileStatement) 
 		) {
	 		if(container.eContents.indexOf(rs) < (container.eContents.length - 1)) {
	 			warning(ErrorMessages.UNREACHABLE_CODE,
	 				DidiPackage.Literals.RETURN_STATEMENT__RETURN_VALUE
	 			);
	 		}
	 	} else {
	 		var EObject[] elements;
	 		if(container instanceof IfStatement) {
	 			elements = (container as IfStatement).statements; 	
 			} else if(container instanceof ForStatement) {
 				elements = (container as ForStatement).statements;
 			} else if(container instanceof WhileStatement) {
 				elements = (container as WhileStatement).statements;
 			}
 			
 			if(elements.indexOf(rs) < elements.length - 1) {
 				warning(ErrorMessages.UNREACHABLE_CODE,
	 				DidiPackage.Literals.RETURN_STATEMENT__RETURN_VALUE
	 			);
 			} else {
 				container = getContainerBeforeDidiModel(rs);
 				if(!(container instanceof FunctionDefinition)) {
 					error(ErrorMessages.WRONG_RETURN_STATEMENT_POSITION,
 						DidiPackage.Literals.RETURN_STATEMENT__RETURN_VALUE
 					);
 				}
 			}
	 	}
 	}

}

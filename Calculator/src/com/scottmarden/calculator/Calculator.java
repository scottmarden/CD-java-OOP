package com.scottmarden.calculator;

public class Calculator {
	private double prevNum;
	private double currentNum;
	private double results;
	
	private boolean multDivFlag;
	private boolean addSubFlag;
	
	boolean resultSet = false;
	
	private String operand = "empty";
	private String resultOperand;

	
	public Calculator(){
	}
	
	public double getResults() {
		return results;
	}
	
	public void performOperation(double num) {
		prevNum = currentNum;
		currentNum = num;
		if(operand != "empty") {
			//Calculate
		}
	}
	
	public void performOperation(String operator) {
		operand = operator;
		if (operator.equals("=")) {
			//Calculate
		}
	}
	
	public void calculate() {
		switch(operand) {
		case "*":
			currentNum = prevNum * currentNum;
			multDivFlag = true;
			break;
		case "/":
			currentNum = prevNum / currentNum;
			multDivFlag = true;
			break;
		case "-":
		case "+":
			if(addSubFlag) {
				if(resultOperand.equals("+")) {
					results = results + currentNum;
				}
				else {
					results = results - currentNum;
				}
			}
			else if(multDivFlag) {
				results = prevNum;
				multDivFlag = false;
			}
			addSubFlag = true;
			resultOperand = operand;
			break;
		case "=":
			if(addSubFlag) {
				if(resultOperand.equals("+")) {
					results = results + currentNum;
				}
				else {
					results = results - currentNum;
				}
			}
		}
		operand = "empty";
	}
	
	
//	public double getOperandOne() {
//		return operandOne;
//	}
//	public void setOperandOne(double operandOne) {
//		this.operandOne = operandOne;
//	}
//	public double getOperandTwo() {
//		return operandTwo;
//	}
//	public void setOperandTwo(double operandTwo) {
//		this.operandTwo = operandTwo;
//	}
//	public double getResults() {
//		return results;
//	}
//	public void setResults(double results) {
//		this.results = results;
//	}
//	public String getOperation() {
//		return operation;
//	}
//	public void setOperation(String operator) {
//		this.operation = operator;
//	}
	
//	public void performOperation() {
//		if(operation.equals("+")) {
//			results = getOperandOne() + getOperandTwo(); 
//		}
//		else if(operation.equals("-")) {
//			results = getOperandOne() - getOperandTwo();
//		}
//		else {
//			System.out.println("Invalid operation");
//		}
//	}		
}

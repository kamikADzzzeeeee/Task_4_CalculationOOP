package yamshikov.oop.calculator;

import yamshikov.oop.calculator.exception.UnknownArithmeticOperationException;
import yamshikov.oop.commands.Commands;
import yamshikov.oop.operations.exception.DivisionByZeroException;

import java.util.List;

public class Calculator {

    public static final String[] allOperation = new String[]{"+", "-", "*", "/", "^"};
    private double firstNumber;
    private double secondNumber;
    private String operation;
    private final Commands commands = new Commands();

    public Calculator(double firstNumber, double secondNumber, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() throws DivisionByZeroException, UnknownArithmeticOperationException {
        return commands.getResultArithmeticOperation(this.firstNumber, this.secondNumber, this.operation);
    }

    public List<String> getUsedOperations(){
        return commands.getListUsedArithmeticOperation();
    }


}

package yamshikov.oop.commands;

import yamshikov.oop.calculator.Calculator;
import yamshikov.oop.calculator.exception.UnknownArithmeticOperationException;
import yamshikov.oop.operations.exception.DivisionByZeroException;
import yamshikov.oop.operations.expression.*;

import java.util.Arrays;
import java.util.List;

public class Commands {

    public Commands() {
    }

    private double calculation(double n1, double n2, String op) throws DivisionByZeroException, UnknownArithmeticOperationException {
        ArithmeticOperationInterface arithmetic = switch (op) {
            case ("+") -> new Addition();
            case ("-") -> new Substruction();
            case ("*") -> new Multiplication();
            case ("/") -> new Division();
            case ("^") -> new Power();
            default -> throw new UnknownArithmeticOperationException();
        };
        return arithmetic.operation(n1, n2);
    }

    public double getResultArithmeticOperation(double n1, double n2, String op) throws DivisionByZeroException, UnknownArithmeticOperationException {
        return calculation(n1, n2, op);
    }

    public List<String> getListUsedArithmeticOperation(){
        return Arrays.asList(Calculator.allOperation);
    }

}

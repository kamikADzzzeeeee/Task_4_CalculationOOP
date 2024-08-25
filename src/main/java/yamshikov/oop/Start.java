package yamshikov.oop;

import yamshikov.oop.calculator.Calculator;
import yamshikov.oop.calculator.exception.UnknownArithmeticOperationException;
import yamshikov.oop.operations.exception.DivisionByZeroException;

public class Start {

    public static void main(String[] args) throws DivisionByZeroException, UnknownArithmeticOperationException {

        Calculator calculator = new Calculator(10,2,"+");
        System.out.println(calculator.getResult());
        calculator.setOperation("-");
        System.out.println(calculator.getResult());
        calculator.setOperation("*");
        System.out.println(calculator.getResult());
        calculator.setOperation("^");
        System.out.println(calculator.getResult());

        //exception divizion by zero
        //calculator.setSecondNumber(0);
        //calculator.setOperation("/");
        //System.out.println(calculator.getResult());

        //exception unknown operation
        //calculator.setOperation("%");
        //System.out.println(calculator.getResult());

        System.out.println(calculator.getUsedOperations());




    }


}

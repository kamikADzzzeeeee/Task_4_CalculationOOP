package yamshikov.oop.operations.expression;

import yamshikov.oop.operations.exception.DivisionByZeroException;

public class Division implements ArithmeticOperationInterface {

    @Override
    public double operation(double n1, double n2) {
        if (n2 == 0) try {
            throw new DivisionByZeroException();
        } catch (DivisionByZeroException e) {
            System.err.print(e.getMessage()+" - ");
        }
        return n1/n2;
    }
}

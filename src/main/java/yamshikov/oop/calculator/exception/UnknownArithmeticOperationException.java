package yamshikov.oop.calculator.exception;

public class UnknownArithmeticOperationException extends Exception {
    public UnknownArithmeticOperationException() {
        super("Неизвестная арифметическая операция");
    }
}

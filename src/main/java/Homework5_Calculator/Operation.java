package Homework5_Calculator;
/**
 *  Возможные операции калькулятора
 */
public enum Operation {
    plus('+'),
    minus('-'),
    multip('*'),
    divis('/');

    private final char operationSymbol;

    Operation(char symbol) {
        this.operationSymbol = symbol;
    }

    public static Operation getBySymbol(char symbol) {
        for (Operation operation : Operation.values()) {
            if (operation.operationSymbol == symbol) {
                return operation;
            }
        }
        return null;
    }
}

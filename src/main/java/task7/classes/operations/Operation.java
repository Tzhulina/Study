package task7.classes.operations;

public class Operation implements OperationInterface {
    OperationsEnum operation;

    public Operation() {
    }

    public Operation setOperation(String operation) {
        this.operation = OperationsEnum.getOperationEnumFromString(operation);
        return returnCertainOperationClass();
    }

    public String getName() {
        return this.operation.name();
    }

    public Character getSign() {
        return this.operation.getValue();
    }

    public Operation returnCertainOperationClass() {
        try {
            switch (this.operation) {
                case Сумма:
                    return new OperationSum();
                case Разность:
                    return new OperationSubtract();
                case Умножение:
                    return new OperationMultiply();
                case Деление:
                    return new OperationDivision();
            }
        } catch (NullPointerException e) {
            System.out.println("Неизвестный тип операции");
        }
        return null;
    }

    public Float countResult(Float one, Float two) {
        System.out.println("Это не должно выполняться");
        return null;
    }
}

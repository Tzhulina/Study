package task7.classes.operations;

public enum OperationsEnum {
    Сумма('+'),
    Разность('-'),
    Умножение('*'),
    Деление('/');

    private final Character sign;

    OperationsEnum(Character value) {
        sign = value;
    }

    public static OperationsEnum getOperationEnumFromString(String operationEnumStr) {
        for (OperationsEnum operationsEnum : OperationsEnum.values()) {
            if (operationsEnum.name().equalsIgnoreCase(operationEnumStr)) {
                return operationsEnum;
            }
        }
        System.out.println(String.format("Неизвестна операция \"%s\". Используйте: %s", operationEnumStr, OperationsEnum.valuesToString())); // Как можно тут использовать обычный toString или переопределить грамотно? тут же статик
        return null;
    }

    public static String valuesToString() {
        String values = "";
        for (OperationsEnum operationsEnum : OperationsEnum.values()) {
            values += String.format("\"%s\" (%s) ", operationsEnum.toString(), operationsEnum.sign);
        }
        return values;
    }

    public Character getValue() {
        return sign;
    }
}

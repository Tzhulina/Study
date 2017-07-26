package task5.classes.operations;

import static task5.classes.operations.OperationsEnum.Умножение;

public class OperationMultiply extends Operation {

    public OperationMultiply() {
        super();
        this.operation = Умножение;
    }

    @Override
    public Float countResult(Float one, Float two) {
        return one * two;
    }
}

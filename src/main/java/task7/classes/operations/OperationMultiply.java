package task7.classes.operations;

import static task7.classes.operations.OperationsEnum.Умножение;

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

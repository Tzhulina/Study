package task7.classes.operations;

import static task7.classes.operations.OperationsEnum.Сумма;

public class OperationSum extends Operation {

    public OperationSum() {
        super();
        this.operation = Сумма;
    }

    @Override
    public Float countResult(Float one, Float two) {
        return one + two;
    }
}
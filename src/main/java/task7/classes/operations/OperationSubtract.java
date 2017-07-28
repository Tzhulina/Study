package task7.classes.operations;

import static task7.classes.operations.OperationsEnum.Разность;

public class OperationSubtract extends Operation {

    public OperationSubtract() {
        super();
        this.operation = Разность;
    }

    @Override
    public Float countResult(Float one, Float two) {
        return one - two;
    }
}

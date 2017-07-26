package task5.classes.operations;

import static task5.classes.operations.OperationsEnum.Деление;

public class OperationDivision extends Operation {

    public OperationDivision() {
        super();
        this.operation = Деление;
    }

    @Override
    public Float countResult(Float one, Float two) {
        if (two != 0)
            return one / two;
        else
            System.err.println("Деление на ноль");
        return null;

    }
}

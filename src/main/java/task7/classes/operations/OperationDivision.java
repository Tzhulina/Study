package task7.classes.operations;

import static task7.classes.operations.OperationsEnum.Деление;

public class OperationDivision extends Operation {

    public OperationDivision() {
        super();
        this.operation = Деление;
    }

    @Override // fixme не получится обрабатывать тут исключения тк float их не даст, будет получаться бесконечность
    public Float countResult(Float one, Float two) {
        if (two != 0f)
            return one / two;
        else
            System.out.println("Деление на ноль");
        return null;
    }
}

package task5.classes.operations;

import static task5.classes.operations.OperationsEnum.Сумма;

public class OperationSum extends Operation {

    public OperationSum() {
        super();
        this.operation = Сумма; // без этой строки получаю null когда вызываю getOperation().getName() в Calculator. у operation class = OperationSum, не могу понять почему
    }

    @Override
    public Float countResult(Float one, Float two) {
        return one + two;
    }
}

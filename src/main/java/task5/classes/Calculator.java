package task5.classes;

import task5.classes.operations.Operation;

public class Calculator extends NumberForCalcs {
    private NumberForCalcs firstNumber;
    private NumberForCalcs secondNumber;
    private Operation operation;
    private Float resultOfOperation;

    public Calculator() {
        this.firstNumber = new NumberForCalcs();
        this.secondNumber = new NumberForCalcs();
        System.out.println("\n---------- Калькулятор запущен ----------");
    }

    public Calculator(String one, String operation, String two) {
        //Calculator(); Как вызвать тут другой конструктор?
        this.firstNumber = new NumberForCalcs();
        this.secondNumber = new NumberForCalcs();
        System.out.println("\n---------- Калькулятор запущен ----------");
        setFirstNumber(one);
        setSecondNumber(two);
        setOperation(operation);
    }

    public void setFirstNumber() {
        System.out.println("Ввод первого числа");
        this.firstNumber.setNumber();
    }

    public void setSecondNumber() {
        System.out.println("Ввод второго числа");
        this.secondNumber.setNumber();
    }

    public void setOperation() {
        System.out.println("Выбор операции");
        this.operation = new Operation().setOperation();
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber.setNumber(firstNumber);
        System.out.println(String.format("Ввод первого числа [%.4f]", this.getFirstNumber()));
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber.setNumber(secondNumber);
        System.out.println(String.format("Ввод второго числа [%.4f]", this.getSecondNumber()));
    }

    public void setOperation(String operation) {
        this.operation = new Operation().setOperation(operation);
        System.out.println(String.format("Выбор операции [%s]", this.getOperation() == null ? this.getOperation() : this.getOperation().getName()));
    }

    public Float getFirstNumber() {
        return this.firstNumber.getNumber();
    }

    public Float getSecondNumber() {
        return this.secondNumber.getNumber();
    }

    public Operation getOperation() {
        return this.operation;
    }

    public Float getResultOfOperation() {
        return resultOfOperation;
    }

    public void calculate() {
        System.out.println("\n----- Вычисление результата");
        if (isCalculatable()) {
            this.resultOfOperation = getOperation().countResult(getFirstNumber(), getSecondNumber());
            printResults();
        }
        System.out.println("----------\n");
    }

    public boolean isCalculatable() {
        if (getFirstNumber() == null || getSecondNumber() == null || getOperation() == null) {
            System.out.println(String.format("Введены не корректные данные для вычисления: "));
            if (getFirstNumber() == null)
                System.out.println("  - Некорректное первое число");
            if (getSecondNumber() == null)
                System.out.println("  - Некорректное второе число");
            if (getOperation() == null)
                System.out.println("  - Некорректная операция");
            return false;
        } else
            return true;
    }

    private void printResults() {
        if (getResultOfOperation() == null) {
        } else
            System.out.println(String.format("%.4f %s %.4f = %.4f", getFirstNumber(), getOperation().getSign(), getSecondNumber(), getResultOfOperation()));
    }
}

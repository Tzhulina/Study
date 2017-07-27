package task5.classes;

import task5.classes.operations.Operation;

import java.util.Scanner;

public class Calculator extends NumberForCalcs {
    private static Scanner scanner = new Scanner(System.in);
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
        this();
        setFirstNumber(one);
        setSecondNumber(two);
        setOperation(operation);
    }

    public void setFirstNumber() {
        System.out.println("Введите первое число: ");
        this.firstNumber.setNumber(scanner.next());
    }

    public void setSecondNumber() {
        System.out.println("Введите второе число");
        this.secondNumber.setNumber(scanner.next());
    }

    public void setOperation() {
        System.out.println("Введите операцию: ");
        this.operation = new Operation().setOperation(scanner.next());
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
            //если несколько условий лучше использовать if-else. тогда, если первый if выпонится, остальные не будут
            //fixme - здесь задумка вывести все что неправильно, например, если она числа введены неверно то выведется эта информация, то есть зайдет в 2 if
            //кстати, в этом месте можно использовать тернарный оператор логическоеУсловие ? выражение1 : выражение2
            //fixme - а вместо одного из выражений можно использовать еще один тернарный оператор?
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

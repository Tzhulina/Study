package task7.classes;

import task7.classes.operations.Operation;

import java.util.Scanner;

public class Calculator extends NumberForCalcs {
    private static Scanner scanner = new Scanner(System.in);
    private NumberForCalcs firstNumber;
    private NumberForCalcs secondNumber;
    private Operation operation;
    private Float resultOfOperation;

    public Calculator() {
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
        setFirstNumber(scanner.next());
    }

    public void setSecondNumber() {
        System.out.println("Введите второе число");
        setSecondNumber(scanner.next());
    }

    public void setOperation() {
        System.out.println("Введите операцию: ");
        setOperation(scanner.next());
    }

    public Float getFirstNumber() {
        return this.firstNumber.getNumber();
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = new NumberForCalcs();
        this.firstNumber.setNumber(firstNumber);
        System.out.println(String.format("Ввод первого числа [%.4f]", this.getFirstNumber()));
    }

    public Float getSecondNumber() {
        return this.secondNumber.getNumber();
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = new NumberForCalcs();
        this.secondNumber.setNumber(secondNumber);
        System.out.println(String.format("Ввод второго числа [%.4f]", this.getSecondNumber()));
    }

    public Operation getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = new Operation().setOperation(operation);
        System.out.println(String.format("Выбор операции [%s]", this.getOperation() == null ? this.getOperation() : this.getOperation().getName()));
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
        try {
            System.out.println(String.format("%.4f %s %.4f = %.4f", getFirstNumber(), getOperation().getSign(), getSecondNumber(), getResultOfOperation()));
        } catch (NullPointerException e) {
            System.out.println("Нет результата вычислений");
            e.printStackTrace();
        }
    }
}

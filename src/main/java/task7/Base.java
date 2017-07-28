package task7;

import task7.classes.Calculator;

/**
 * @author Татьяна
 */
public class Base {

    public static void main(String[] args) {
        Calculator calculatorq = new Calculator("12.65", "сумма", "87,35");
        calculatorq.calculate();

        Calculator calculator = new Calculator();

        calculator.setFirstNumber("123.54");
        calculator.setSecondNumber("876,46");
        calculator.setOperation("сумма");
        calculator.calculate();

        calculator.setFirstNumber("123");
        calculator.setSecondNumber("7");
        calculator.setOperation("сумма");
        calculator.calculate();

        calculator.setFirstNumber("123.54");
        calculator.setSecondNumber("876,46");
        calculator.setOperation("сума");
        calculator.calculate();

        calculator.setFirstNumber("123.54");
        calculator.setSecondNumber("");
        calculator.setOperation("сумма");
        calculator.calculate();

        calculator.setFirstNumber("");
        calculator.setSecondNumber("");
        calculator.setOperation("");
        calculator.calculate();

        calculator.setFirstNumber("sfdvsv");
        calculator.setSecondNumber("876,46");
        calculator.setOperation("сумма");
        calculator.calculate();

        calculator.setFirstNumber("1123.54");
        calculator.setSecondNumber("876,46");
        calculator.setOperation("разность");
        calculator.calculate();

        calculator.setFirstNumber("123.54");
        calculator.setSecondNumber("876,46");
        calculator.setOperation("разность");
        calculator.calculate();

        calculator.setFirstNumber("123.54");
        calculator.setSecondNumber("876,46");
        calculator.setOperation("умножение");
        calculator.calculate();

        calculator.setFirstNumber("11111.54");
        calculator.setSecondNumber("111111,46");
        calculator.setOperation("умножение");
        calculator.calculate();

        calculator.setFirstNumber("123.54");
        calculator.setSecondNumber("8,46");
        calculator.setOperation("деление");
        calculator.calculate();

        calculator.setFirstNumber("123.54");
        calculator.setSecondNumber("0");
        calculator.setOperation("деление");
        calculator.calculate();

        calculator.setFirstNumber();
        calculator.setSecondNumber();
        calculator.setOperation();
        calculator.calculate();
    }
}

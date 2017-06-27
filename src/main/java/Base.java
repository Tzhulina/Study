import java.util.Scanner;

/**
 * Created by Татьяна on 24.06.2017.
 * @author Татьяна
 * @see #calculator()
 */
public class Base {

    private static Scanner scanner = new Scanner(System.in); // Переменная класса для считывания ввода их консоли

    /**
     * Начало программы
     *
     * @param args
     */
    public static void main(String[] args) {
        // Создаем объект класса Base
        Base programm = new Base();
        programm.calculator();
    }

    /**
     * Метод для работы калькулятора
     */
    private void calculator() {
        // Вводим данные
        Float firstNum = Float.parseFloat(input("first number").replaceAll(",", "\\."));
        Float secondNum = Float.parseFloat(input("second number").replaceAll(",", "\\."));
        String operation = input("operation");
        // Выводим результат
        System.out.printf("Result is: %.4f\n", counting(firstNum, secondNum, operation));
    }

    /**
     * Метод ввода из консоли
     *
     * @param message String уточнение ввода чего именно
     * @return String полученная строка
     */
    private String input(String message) {
        System.out.println(String.format("Enter the %s:", message));
        return scanner.next();
    }

    /**
     * Метод вычисления операции над двумя числами
     *
     * @param firstNum  Float первое число
     * @param secondNum Float второе число
     * @param operation String символ операции, + - * /
     * @return Float полученный результат операции
     */
    private Float counting(Float firstNum, Float secondNum, String operation) {
        switch (operation) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return firstNum / secondNum;
            default:
                System.err.println("Неопознан тип операции");
                return -1f;
        }
    }
}

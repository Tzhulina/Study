import java.util.Scanner;

/**
 * @author Татьяна
 * @see #calculator() - Задание 2
 * @see #stringArray() - Задание 3
 */
public class Base {

    private static Scanner scanner = new Scanner(System.in); // Переменная класса для считывания ввода их консоли

    /**
     * Начало программы
     *
     * @param args
     */
    public static void main(String[] args) {
        // Создание объекта класса Base
        Base programm = new Base();
        // Ввод номера задания
        switch (Integer.parseInt(programm.input("number of task (1 - calculator, 2 - string array)"))) {
            case 1:
                // Запуск калькулятора
                programm.calculator();
                break;
            case 2:
                // Запуск поиска максимального слова в массиве
                programm.stringArray();
                break;
            default:
                System.out.println("Invalid task number");
        }
    }

    /**
     * Метод для работы калькулятора
     */
    public void calculator() {                                                      
        // Ввод двух чисел и типа операции
        Float firstNum = Float.parseFloat(input("first number").replaceAll(",", "\\."));  //точку можно не экранировать
        Float secondNum = Float.parseFloat(input("second number").replaceAll(",", "\\."));
        String operation = input("operation");
        // Вывод результата
        System.out.printf("Result is: %.4f\n", counting(firstNum, secondNum, operation));  //counting(firstNum, secondNum, operation) лучше вынести в переменную. 
                                                                                           //При ошибке знака у тебя результат все равно будет выводиться. Так не хорошо 
    }

    public void stringArray() {
        // Ввод количества слов и самих слов
        int numOfWords = Integer.parseInt(input("number of words"));
        String[] words = new String[numOfWords];
        for (int i = 0; i < numOfWords; i++) {
            words[i] = input(String.format("%d word", i + 1));
        }
        // Поиск и вывод результата
        printTheLongestWord(words);
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
    private Float counting(Float firstNum, Float secondNum, String operation) {     // а если деление на ноль?
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
                System.err.println("Invalid operation type");
                return -1f;
        }
    }

    /**
     * Поиск и вывод самого длинного слова из массива
     *
     * @param words String[] массив слов
     */
    public void printTheLongestWord(String[] words) {
        int index = -1, wordLenght = 0;
        for (int i = 0; i < words.length; i++) {
            int currentLenght = words[i].length();
            index = currentLenght > wordLenght ? i : index;
            wordLenght = currentLenght > wordLenght ? currentLenght : wordLenght;
        }
        System.out.println(String.format("The longest word is \"%s\", it contains %d letters and located in position %d (starts with 1)", words[index], wordLenght, index + 1));
    }
}

package task5.classes;

import java.util.Scanner;

//в конкретной реализации числа должны быть методы, не привязанные к источнику получения данных
//number не должен знать, откуда к ниму приходят значения. он должен уметь только работать с ними
//scanner лучше вынести на уровень выше, в Calculator. там задавать источник данных в переопределенных методах
//и проверку валидности строки тоже нужно вынести на уровень вверх в калькулятор или даже отдельный класс
//таким образом от NumberForCalcs можно вообще избавиться
public class NumberForCalcs {
    private static Scanner scanner = new Scanner(System.in);
    private Float number;

    public NumberForCalcs() {
    }

    public void setNumber() {
        System.out.println("Введите число: ");
        this.number = getNumberFromString(scanner.next());
    }

    public Float getNumber() {
        return this.number;
    }

    public void setNumber(String numberStr) {
        this.number = getNumberFromString(numberStr);
    }

    public Float getNumberFromString(String numberStr) {
        //если я введу число без запятой, 7 например, программа не сработает
        //это не особо удобно
        if (!numberStr.equals("") & numberStr.matches("-?[\\d]+.?,?[\\d]+")) {
            numberStr = numberStr.replaceAll(",", ".");
            numberStr = numberStr.contains(".") ? numberStr : numberStr + ".00";
            return Float.parseFloat(numberStr);
        }
        return null;
    }
}

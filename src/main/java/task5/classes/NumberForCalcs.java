package task5.classes;

import java.util.Scanner;

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
        if (!numberStr.equals("") & numberStr.matches("-?[\\d]+.?,?[\\d]+")) {
            numberStr = numberStr.replaceAll(",", ".");
            numberStr = numberStr.contains(".") ? numberStr : numberStr + ".00";
            return Float.parseFloat(numberStr);
        }
        return null;
    }
}

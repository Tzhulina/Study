import java.util.Random;

/**
 * Created by t.zhulina on 10.07.2017.
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] digits = sin(20, -10, 10);
        sout("Generated array of int:", digits);
        int imin = getMinIndex(digits);
        int imax = getMaxIndex(digits);
        if (imax != -1 && imin != -1) {
            rePlace(digits, imin, imax);
            sout("Changed array of int:", digits);
        }
    }

    /**
     * Генерация массива
     *
     * @param count количество чисел
     * @param min   минимальное зничение
     * @param max   максимальное значение
     * @return массив чисел
     */
    private static int[] sin(int count, int min, int max) {
        Random random = new Random();
        int[] digits = new int[count];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = random.nextInt(max - min) + min;
        }
        return digits;
    }

    /**
     * Вывод массива на печать
     *
     * @param message сообщение перед массивом
     * @param digits массив чисел
     */
    private static void sout(String message, int[] digits) {
        System.out.println(message);
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }

    /**
     * Поиск минимального положительного элемента
     *
     * @param digits
     * @return индекс минимального элемента в массиве
     */
    private static int getMinIndex(int[] digits) {
        int min = 0, index = -1;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > 0) {
                if (min != 0) {
                    if (digits[i] < min) {
                        min = digits[i];
                        index = i;
                    }
                } else {
                    min = digits[i];
                    index = i;
                }
            }
        }
        if (index != -1)
            System.out.println(String.format("Min positiv digit = %s and it is on the position number %s from the beginning (1)", min, index + 1));
        else
            System.out.println("There is no positive items");
        return index;
    }

    /**
     * Поиск максимального отрицательного
     *
     * @param digits
     * @return индекс максимального элемента в массиве
     */
    private static int getMaxIndex(int[] digits) {
        int max = 0, index = -1;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 0) {
                if (max != 0) {
                    if (digits[i] > max) {
                        max = digits[i];
                        index = i;
                    }
                } else {
                    max = digits[i];
                    index = i;
                }
            }
        }
        if (index != -1)
            System.out.println(String.format("Max negativ digit = %s and it is on the position number %s from the beginning (1)", max, index + 1));
        else
            System.out.println("There is no negative items");
        return index;
    }

    /**
     * Поменять местами 2 элемента массива
     *
     * @param digits массив
     * @param first  индекс первого меняемого
     * @param second индекс другого меняемого
     * @return измененный массив
     */
    public static int[] rePlace(int[] digits, int first, int second) {
        digits[first] = digits[first] + digits[second];
        digits[second] = digits[first] - digits[second];
        digits[first] = digits[first] - digits[second];
        return digits;
    }
}

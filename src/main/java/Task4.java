import java.util.Random;

/**
 * Created by t.zhulina on 10.07.2017.
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] digits = sin(20, -10, 10);
        System.out.println("Generated array of int:");
        sout(digits);

        int min = getMinIndex(digits);
        System.out.println(String.format("Min digit = %s and it is on the position number %s from the 1", digits[min], min + 1));
        int max = getMaxIndex(digits);
        System.out.println(String.format("Max digit = %s and it is on the position number %s from the 1", digits[max], max + 1));

        int buf = digits[max];
        digits[max] = digits[min];
        digits[min] = buf;

        System.out.println("Changed array of int:");
        sout(digits);
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
     * вывод массива на печать
     *
     * @param digits
     */
    private static void sout(int[] digits) {
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }

    /**
     * Поиск минимума
     *
     * @param digits
     * @return индекс минимального элемента в массиве
     */
    private static int getMinIndex(int[] digits) {
        int min = 0;
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] < digits[min])
                min = i;
        }
        return min;
    }

    /**
     * Поиск максимума
     *
     * @param digits
     * @return индекс максимального элемента в массиве
     */
    private static int getMaxIndex(int[] digits) {
        int max = 0;
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] > digits[max])
                max = i;
        }
        return max;
    }
}

package task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Base {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> wordsAndCount = new TreeMap<>();
        Scanner scanner = new Scanner(new File("C:\\Study\\Git\\task6.txt"));
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = wordsAndCount.get(word);
            count = count == null ? 0 : count;
            wordsAndCount.put(word, ++count);
        }
        System.out.println("Статистика по словам прочитанным из файла:\n" + wordsAndCount);

        Integer maxCount = 0;
        String word = null;
        boolean first = true;
        for (Map.Entry<String, Integer> item : wordsAndCount.entrySet()) {
            if (first) {
                maxCount = item.getValue();
                word = item.getKey();
                first = false;
            }
            if (item.getValue() > maxCount) {
                maxCount = item.getValue();
                word = item.getKey();
            }
        }
        System.out.println(String.format("Самое популярное слово [%s], оно используется %d раз", word, maxCount));
    }
}

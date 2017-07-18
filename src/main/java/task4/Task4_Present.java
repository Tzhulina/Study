package task4;

import task4.newYearSweetPresent.*;

/**
 * Created by t.zhulina on 10.07.2017.
 * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.) У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Необходимо собрать подарок из сладостей. Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */
public class Task4_Present {
    public static void main(String[] args) {
        printOnScreen(collectSweets());
    }

    /**
     * Набираем конфеты
     *
     * @return подарок
     */
    private static NewYearSweetPresent[] collectSweets() {
        Bisquit bisquit = new Bisquit("Sharlotka", 500, 200.00, "apple");
        Candy candy = new Candy("Moscow", 15, 3.50, "small");
        Candy candy1 = new Candy("HalvaVShokolade", 25, 10.80, "medium");
        Chocolate chocolate = new Chocolate("Twix", 50, 25.00, "karamel");
        JellyBean jellyBean = new JellyBean("BertyBotts", 100, 45.00, "different");
        JellyBean jellyBean1 = new JellyBean();
        jellyBean1.setName("Lemon");
        jellyBean1.setWeight(30);
        jellyBean1.setPrice(1.20);
        jellyBean1.setColor("yellow");
        NewYearSweetPresent[] newYearSweetPresent = {bisquit, candy, candy1, chocolate, jellyBean, jellyBean1};
        return newYearSweetPresent;
    }

    /**
     * Подсчет общего веса
     *
     * @param newYearSweetPresent подарок
     * @return Общий вес
     */
    private static int getTotalWeight(NewYearSweetPresent[] newYearSweetPresent) {
        int weight = 0;
        for (NewYearSweetPresent item : newYearSweetPresent) {
            weight += item.getWeight();
        }
        return weight;
    }

    /**
     * Подсчет общей стоимости
     *
     * @param newYearSweetPresent подарок
     * @return Общая цена
     */
    private static double getTotalPrice(NewYearSweetPresent[] newYearSweetPresent) {
        double price = 0;
        for (NewYearSweetPresent item : newYearSweetPresent) {
            price += item.getPrice();
        }
        return price;
    }

    /**
     * Выводим Общий вес, общую цену и список конфет подарка
     *
     * @param newYearSweetPresent подарок
     */
    private static void printOnScreen(NewYearSweetPresent[] newYearSweetPresent) {
        System.out.println(String.format("Total weight = %d, total price = %.2f", getTotalWeight(newYearSweetPresent), getTotalPrice(newYearSweetPresent)));
        System.out.println("List of items:");
        for (NewYearSweetPresent item : newYearSweetPresent) {
            System.out.println(item.toString());
        }
    }
}

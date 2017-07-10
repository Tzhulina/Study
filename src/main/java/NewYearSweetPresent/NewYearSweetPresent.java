package NewYearSweetPresent;

/**
 * Created by t.zhulina on 10.07.2017.
 */
public abstract class NewYearSweetPresent {

    private String name;
    private int weight;
    private Double price;

    public NewYearSweetPresent() {
    }

    public NewYearSweetPresent(String name, int weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Name = %s, Weight = %s, Price = %s", name, weight, price);
    }
}

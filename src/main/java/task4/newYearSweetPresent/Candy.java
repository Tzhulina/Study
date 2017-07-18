package task4.newYearSweetPresent;

/**
 * Created by t.zhulina on 10.07.2017.
 */
public class Candy extends NewYearSweetPresent {

    private String size;

    public Candy() {
    }

    public Candy(String name, int weight, Double price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("Candy = [%s, Size = %s]", super.toString(), size);
    }
}

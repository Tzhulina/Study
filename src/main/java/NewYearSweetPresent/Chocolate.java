package NewYearSweetPresent;

/**
 * Created by t.zhulina on 10.07.2017.
 */
public class Chocolate extends NewYearSweetPresent {

    private String taste;

    public Chocolate() {
    }

    public Chocolate(String name, int weight, Double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Chocolate = [%s, Taste = %s]", super.toString(), taste);
    }
}

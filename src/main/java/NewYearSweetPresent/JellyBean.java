package NewYearSweetPresent;

/**
 * Created by t.zhulina on 10.07.2017.
 */
public class JellyBean extends NewYearSweetPresent {

    private String color;

    public JellyBean() {
    }

    public JellyBean(String name, int weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("JellyBean = [%s, Color = %s]", super.toString(), color);
    }
}

package task4.newYearSweetPresent;

/**
 * Created by t.zhulina on 10.07.2017.
 */
public class Bisquit extends NewYearSweetPresent {

    private String smell;

    public Bisquit() {
    }

    public Bisquit(String name, int weight, Double price, String smell) {
        super(name, weight, price);
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return String.format("Bisquit = [%s, Smell = %s]", super.toString(), smell);
    }
}

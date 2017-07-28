package task7.classes;

public class NumberForCalcs {

    private Float number;

    public NumberForCalcs() {
    }

    public Float getNumber() {
        return this.number;
    }

    public void setNumber(String numberStr) {
        if (!numberStr.equals("") & (numberStr.matches("-?[\\d]+.?,?[\\d]+") | numberStr.matches("\\d"))) {
            numberStr = numberStr.replaceAll(",", ".");
            numberStr = numberStr.contains(".") ? numberStr : numberStr + ".";
            this.number = Float.parseFloat(numberStr);
        }
    }
}

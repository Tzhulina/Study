package task5.classes;

//и проверку валидности строки тоже нужно вынести на уровень вверх в калькулятор или даже отдельный класс
// - fixme это и есть отдельный класс для работы с числом чтоб неповторять одно и тоже при работе с первым и вторым числом,
// - fixme если все перенести в калькулятор то там будет помойка и неудобно же, а так у нас есть класс знающий как работать с числом
//таким образом от NumberForCalcs можно вообще избавиться
public class NumberForCalcs {

    private Float number;

    public NumberForCalcs() {
    }

    public Float getNumber() {
        return this.number;
    }

    public void setNumber(String numberStr) {
        //если я введу число без запятой, 7 например, программа не сработает, это не особо удобно
        // fixme 7 не срабатывало тк не подумала об одинарных числах, но как иначе проверять на отсутствие букв? только try catch?
        if (!numberStr.equals("") & (numberStr.matches("-?[\\d]+.?,?[\\d]+") | numberStr.matches("\\d"))) {
            numberStr = numberStr.replaceAll(",", ".");
            numberStr = numberStr.contains(".") ? numberStr : numberStr + ".00";
            this.number = Float.parseFloat(numberStr);
        }
    }
}

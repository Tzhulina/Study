import java.util.Scanner;

/**
 * Created by Татьяна on 24.06.2017.
 */
public class Base {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        Float firstNum = scanner.nextFloat();
        System.out.println("Enter the second number:");
        Float secondNum = scanner.nextFloat();
        Float result = firstNum + secondNum;
        System.out.printf("Sum is: %.4f\n", result);
        scanner.close();
    }
}

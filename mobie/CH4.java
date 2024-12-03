import java.util.Scanner;
import java.text.DecimalFormat;
public class CH4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        DecimalFormat d1 = new DecimalFormat("0,000,000,000.00");
        DecimalFormat d2 = new DecimalFormat("$#,000,000,000.00");
        DecimalFormat d3 = new DecimalFormat("#,000,000,000.00");

        System.out.print("Enter a number: ");
        number = scanner.nextDouble();

        System.out.println("type 1 : = "+ d1.format(number));
        System.out.println("type 2 : = "+ d2.format(number));
        System.out.println("type 3 : = "+ d3.format(number));
    }
}

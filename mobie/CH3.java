import java.util.Scanner;

public class CH3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        int number = 0;
        String color = "";
        
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.print("Enter a color: ");
        color = scanner.next();
        System.out.print("number = " +  number +", color = " + color);
        System.out.println();

        result = (number < 10 ) && (color =="red");
        System.out.print("Result: " + result)
    }
    
}

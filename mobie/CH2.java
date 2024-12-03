import java.util.Scanner;

public class CH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0 ,b=0;
        double y;

        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
         
        System.out.println("when a= "+a+" b = "+b );
        y= (a-b)*(a+b);
        System.out.println("y= (a-b)*(a+b) = "+y);
        y=3*((a-b)*(a+b))-6;
        System.out.println("y=3*((a-b)*(a+b))-6 ="+y);
        y=1-(2*a)/(3*b);
        System.out.println("y=1-(2*a)/(3*b) = "+y);
    }
}
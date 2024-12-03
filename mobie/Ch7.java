import java.util.Scanner;
import java.text.DecimalFormat;
public class Ch7 {
    public static void main(String[] args) {
        int total ;
        int counter ;
        int score ;
        double average ;
        Scanner scanner = new Scanner(System.in);

        total = 0;
        counter = 0;
        System.out.print("enter or -1 :");
        score = scanner.nextInt();

        while (score != -1) { 
            total = total + score;
            counter = counter + 1;
            System.out.print("enter or -1 :");
            score = scanner.nextInt();
            
        } 
        DecimalFormat twoDigigits = new DecimalFormat("0.00");
        if (counter != 0) {
            average = (double) total / counter;
            System.out.println("cass average " + twoDigigits.format(average));
            
        } else {System.out.println("no score");}
    }
    
}

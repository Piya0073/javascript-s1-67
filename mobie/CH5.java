import java.util.Scanner;
public class CH5{
    public static void main(String[] args) {
        int score;
        Scanner scan = new Scanner(System.in);

        System.out.print("programe calculate  ");
        System.out.print("Enter grade : ");
        score = scan.nextInt();

        if ((score >= 0) && (score <= 100)){
            String grade;
            if (score >= 80) grade = "A";
            else if (score >= 75) grade = "B+";
            else if (score >= 70) grade = "B";
            else if (score >= 65) grade = "C+";
            else if (score >= 60) grade = "C";
            else if (score >= 55) grade = "D+";
            else if (score >= 50) grade = "D";
            else grade = "F";
            System.out.println("Grade : " + grade);

        }else{
            System.out.println("Invalid score");
        }

        System.out.println("end programe");
    }


}

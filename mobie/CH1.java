import java.util.Scanner;


public class CH1 {
    long id;
    String name;
    int age;
    double salary;

    public static void main(String[] args) {
        CH1 person;
        Scanner scan = new Scanner(System.in);
        String strValue;

        person = new CH1 ();
        System.out.print("enter ID :");
        person.id = scan.nextInt();
        System.out.print("Enter Name :");
        person.name = scan.next();
        System.out.print("Enter Age :");
        person.age = scan.nextInt();
        System.out.print("Enter Salary :");
        person.salary = scan.nextDouble();

        System.out.println("DATA PERSON : ");
        System.out.println("===========================");
        System.out.println("ID : " + person.id);
        System.out.println("NAME : " + person.name);
        System.out.println("AGE : " + person.age);
        System.out.println("SALARY : " + person.salary);

    }
}
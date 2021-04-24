import java.util.Scanner;

public class ScannerPgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name,age,salary: ");
        String Name=sc.nextLine();
        int age=sc.nextInt();
        double salary=sc.nextDouble();
        System.out.println("Name:" + Name + " Age "+ age +"Salary " + salary);
    }
}

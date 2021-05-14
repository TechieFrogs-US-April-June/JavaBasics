package src.Inheritance;

public class Programmer extends Employee{
    int bonus = 5000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer Salary is " + p.salary );
        System.out.println("Programmer Bonus is " + p.bonus);

    }
    
}

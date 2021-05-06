package ClassesAndObjectsAssignment;

public class Employee {

    private String name;
    private int year_of_joining;
    private double salary;
    private String address;

    public Employee(String name, int year_of_joining, double salary, String address) {
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.salary = salary;
        this.address = address;
    }

    void printEmpDetails() {
        System.out.println(this.name+"\t\t\t"+this.year_of_joining+"\t\t\t"+this.salary+"\t\t\t"+this.address);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, 20000.36, "64C-WallsStreet");
        Employee emp2 = new Employee("Samuel", 2000, 14555.25, "68D-WallsStreet");
        Employee emp3 = new Employee("John", 1999, 25899.65, "26B-WallsStreet");
        System.out.println("Name\t\t\tYear of joining\t\tSalary\t\t\tAddress");
        emp1.printEmpDetails();
        emp2.printEmpDetails();
        emp3.printEmpDetails();
    }
}

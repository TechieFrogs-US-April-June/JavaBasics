package ClassesAndObjectsAssignment;

public class EmployeeProg10 {

    private String name;
    private int year_of_joining;
    private double salary;
    private String address;

    public EmployeeProg10(String name, int year_of_joining, double salary, String address) {
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.salary = salary;
        this.address = address;
    }

    void printEmpDetails() {
        System.out.println(this.name+"\t\t\t"+this.year_of_joining+"\t\t\t"+this.salary+"\t\t\t"+this.address);
    }

    public static void main(String[] args) {
        EmployeeProg10 emp1 = new EmployeeProg10("Robert", 1994, 20000.36, "64C-WallsStreet");
        EmployeeProg10 emp2 = new EmployeeProg10("Samuel", 2000, 14555.25, "68D-WallsStreet");
        EmployeeProg10 emp3 = new EmployeeProg10("John", 1999, 25899.65, "26B-WallsStreet");
        System.out.println("Name\t\t\tYear of joining\t\tSalary\t\t\tAddress");
        emp1.printEmpDetails();
        emp2.printEmpDetails();
        emp3.printEmpDetails();
    }
}

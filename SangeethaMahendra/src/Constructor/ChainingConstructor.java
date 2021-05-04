package src.Constructor;

public class ChainingConstructor {

    String empName= " Mahi";
    int empSalary = 20000;
    String address = "NC";

    void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Address: " + address);
    }

    // default constructor of the class
    public ChainingConstructor() {
        this("Mahendra");
    }

    // call the constructor with (String, int) param
    public ChainingConstructor(String name){
        
       this(name,120067);
     }
 
     //call the constructor with (String, int, String) param
    public ChainingConstructor(String name, int sal) {
        this(name,sal, "Texas");
    }

    public ChainingConstructor(String empName, int empSalary, String address) {

        System.out.println("Employee Name in Constructor: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Employee Salary: " + this.empSalary);
        System.out.println("Employee Address: " + this.address);
         //this.empName = empName;
           // empSalary = empSalary;
             //address = address;
    }

    public static void main(String[] args) {

        // Creating object reference
        ChainingConstructor obj = new ChainingConstructor();
        obj.display();

    }

}

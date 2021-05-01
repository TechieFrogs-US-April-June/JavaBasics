package src.Constructor;

public class ChainingConstructor {

    String empName;
    int empSalary;
    String address;

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

    public ChainingConstructor(String name, int sal, String addr) {
             this.empName = name;
             this.empSalary = sal;
             this.address = addr;
    }

    public static void main(String[] args) {

        // Creating object reference
        ChainingConstructor obj = new ChainingConstructor();
        obj.display();

    }

}

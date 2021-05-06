package InheritanceAssignment;

public class Member {
    String Name;
    int Age;
    long PhoneNumber;
    String Address;
    int Salary;

    void printSalary() {
        System.out.println("Salary: " +Salary);
    }
}

class Employee extends Member {
    String Specialization;
    String Department;
}

class Manager extends Member {
    String Specialization;
    String Department;


    public static void main(String[] args) {
        Employee empObj = new Employee();
        System.out.println("Name: " +empObj.Name);
        System.out.println("Age: " +empObj.Age);
        System.out.println("PhoneNumber: " +empObj.PhoneNumber);
        System.out.println("Address: " +empObj.Address);
        System.out.println("Salary: " +empObj.Salary);
        Manager managerObj = new Manager();
        System.out.println("Name: " +managerObj.Name+ " Age: " +managerObj.Age+ " PhoneNumber: " +managerObj.PhoneNumber+ " Address: " +managerObj.Address+ " Salary: " +managerObj.Salary);
        //System.out.println("Age: " +managerObj.Age);
        //System.out.println("PhoneNumber: " +managerObj.PhoneNumber);
        //System.out.println("Address: " +managerObj.Address);
        //System.out.println("Salary: " +managerObj.Salary);
        //managerObj.printSalary();
    }
}

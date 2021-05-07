package InheritanceAssignment;

public class Member {
    private String name;
    private int age;
    private int phoneNumber;
    private String address;
    private int salary;

    public Member() {
    }

    public Member(String name, int age, int phoneNumber, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    void printSalary() {
        System.out.println("Salary: " +this.salary);
    }
}

class Employee extends Member {
    private String specialization;
    private String department;

    public Employee(String name, int age, int phoneNumber, String address, int salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }
    void printDetails() {
        System.out.println("Employee Name: "+getName());
        System.out.println("Employee Age: "+getAge());
        System.out.println("Employee phone: "+getPhoneNumber());
        System.out.println("Employee address: "+getAddress());
        System.out.println("Employee salary: "+getSalary());
        System.out.println("Employee specialization: "+this.specialization);
        System.out.println("Employee department: "+this.department);
    }
}

class Manager extends Member {
    private String specialization;
    private String department;

    public Manager(String name, int age, int phoneNumber, String address, int salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    void printDetails() {
        System.out.println("Manager Name: "+getName());
        System.out.println("Manager Age: "+getAge());
        System.out.println("Manager phone: "+getPhoneNumber());
        System.out.println("Manager address: "+getAddress());
        System.out.println("Manager salary: "+getSalary());
        System.out.println("Manager specialization: "+this.specialization);
        System.out.println("Manager department: "+this.department);
    }

    public static void main(String[] args) {
        Employee empObj = new Employee("John", 25, 252365231, "654 Bakers Street", 25631, "Java", "IT");
        Manager managerObj = new Manager("Sam", 28, 56987452, "999 hull street", 84571, "Hiring", "Human Resources");
        empObj.printDetails();
        managerObj.printDetails();
    }
}

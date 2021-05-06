package OopsInheritance;

class Employee {
    void print() {
        System.out.println("work");
    }
}

class Programmer extends Employee {
    void display() {
        System.out.println("coding");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Programmer proObj = new Programmer();
        proObj.display();
        proObj.print();
    }

}

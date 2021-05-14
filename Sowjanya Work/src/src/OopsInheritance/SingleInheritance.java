package OopsInheritance;

class Employee {
    private int x = 10;
    private void print() {
        System.out.println("work");
    }
}

class Programmer extends Employee {

     void print() {
        System.out.println("this is print method");
    }
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

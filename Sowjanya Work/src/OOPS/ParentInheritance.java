package OOPS;

public class ParentInheritance { //Super class/parent class/base class
    int a = 10;
    int b = 20;
}

class Child extends ParentInheritance { //child class/sub class/derived class/extended class
    int a = 100;
    int b = 200;

    void add(int a, int b) {
        System.out.println(a + b); //Local Variables
        System.out.println(this.a + this.b); //Current class variables
        System.out.println(super.a + super.b); //Super class variables
    }

    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.add(1000,2000);

    }
}
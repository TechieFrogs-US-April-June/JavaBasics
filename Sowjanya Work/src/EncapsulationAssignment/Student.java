package EncapsulationAssignment;

public class Student {
    private int age;
    private String name;
    private String address;

    public Student() {
        this.address = "not available";
        this.age = 0;
        this.name = "unknown";
    }

    public void setInfo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setInfo(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void displayStudent() {
        System.out.println("Student id: "+this.age +"\tName: "+this.name+"\t\tAddress: "+this.address);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo(5, "John");
        student1.displayStudent();
        Student student2 = new Student();
        student2.setInfo(15, "Sam", "625 Baker Street");
        student2.displayStudent();
    }
}

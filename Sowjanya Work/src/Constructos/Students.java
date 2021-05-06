package Constructos;

public class Students {
    String name;
    int id;
    int age;
    public Students() {
        System.out.println("Adding student records");
    }
    public Students(String name, int age, int id) {
        System.out.println("name: " +name+" " + "age: " +age+ " " + "Id: " +id);
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.age = 15;
        s1.id = 1;
        s1.name = "Tom";

        Students s2 = new Students();
        s2.age = 16;
        s2.id = 2;
        s2.name = "Jack";

        Students s3 = new Students("Ram",17,3);
        System.out.println("name: " +s3.name);
        System.out.println("age: " +s3.age);
        System.out.println("Id: " +s3.id);

    }
}

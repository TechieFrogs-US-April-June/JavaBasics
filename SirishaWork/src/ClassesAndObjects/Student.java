package SirishaWork.src.ClassesAndObjects;

public class Student {
    String address;
    String name;
    int rollno;
    long phoneno;


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sirisha";
        s1.rollno = 2;
        s1.phoneno = 4536789088L;
        s1.address = "660 bundy ave";

        Student s2 = new Student();
        s2.name = "Sam";
        s2.rollno = 13;
        s2.phoneno = 3455679800L;
        s2.address = "540 ardis ave";

        System.out.println("The name is: "+ s1.name +" roll number is: "+s1.rollno +" phone no is: "+s1.phoneno +" and Address is: "+s1.address);
        System.out.println("The name is: "+s2.name +" roll number is : "+s2.rollno +" phone no is: "+s2.phoneno +" and Address is: "+s2.address);
    }
}

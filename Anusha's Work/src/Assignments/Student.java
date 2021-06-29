package Assignments;
class Address{
    String hno;
    String location;

    Address(String hno,String location){
        this.hno=hno;
        this.location=location;
    }

}

public class Student {
    int rollno;
    String name;
    Address studentaddr;
    Student(int rollno,String name,Address studentaddr){
        this.rollno=rollno;
        this.name=name;
        this.studentaddr=studentaddr;
    }
    public static void main(String[] args) {
        Address addressObj=new Address("123","w Lane");
        Student studentObj=new Student(101,"Techie",addressObj);
        System.out.println(studentObj.rollno+"-"+studentObj.name);
        System.out.println(studentObj.studentaddr.hno+"--"+studentObj.studentaddr.location);

    }
}

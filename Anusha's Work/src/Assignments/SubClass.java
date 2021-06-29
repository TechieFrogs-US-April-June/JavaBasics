package Assignments;
class ParentClass{
    ParentClass(){
        System.out.println("Parent Class Constructor");
    }
}
public class SubClass extends ParentClass {
    SubClass(){
        System.out.println("SubCLass Constructor");
    }
    SubClass(int num){
        System.out.println("Arg constructor"+num);
    }
    void display(){

        System.out.println("From SubClass Display Method");
    }
    public static void main(String[] args) {
        SubClass subObj=new SubClass();
        subObj.display();
        SubClass s1=new SubClass(10);
        subObj.display();

    }
}

import java.io.PrintStream;

class Student{
   static int k=5;
    
    void num(){
        int l=7;
        int m=8;
        System.out.println(Student.k);
        System.out.println(l+m);
    }
}

public class TestObject1 {
    int a=10;
    int b=20;
    static int i=30;

    void display1(){
        System.out.println(a+" "+b);
        System.out.println(EmployeeExample.h);
        System.out.println(TestObject1.i);
    }
 public static void main(String[] args){
     TestObject1 tstObj1=new TestObject1();
     EmployeeExample eeobj=new EmployeeExample();
     Student sobj=new Student();
     sobj.num();
     eeobj.add();

     tstObj1.display1();
     tstObj1.a=40;
     tstObj1.b=50;
     
    System.out.println(tstObj1.a+" "+tstObj1.b);
     tstObj1.display1();
     TestObject2 tstObj4=new TestObject2();
     tstObj4.display2();
 }
    
}

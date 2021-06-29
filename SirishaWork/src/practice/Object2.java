package SirishaWork.src.practice;

class TestStudent{
        int b = 5;
}
//class name and file name should be same
class Object2 {  // driver class - which is having a main method
    static int j = 15;
    int x = 1;
    int y = 2;
   //Behaviour should be mentioned in the methods
    void sum(){
        TestObject1 testoldobj = new TestObject1();
        testoldobj.display(); //displayed output from the other class
    }
    public static void main(String[] args) {
        System.out.println(TestObject1.i); //i is static (Public) and is directly accessible
       // Student1 studentobj = new Student1();
        //System.out.println(Student1.name);
        //System.out.p intln(studentobj.a);
        TestStudent testStudentobj = new TestStudent();
        System.out.println(testStudentobj.b);
        Object2 testobj1 = new Object2();
        testobj1.x = 3;
        testobj1.y = 4;
        testobj1.sum();
        System.out.println(testobj1.x+" "+ testobj1.y);
    }
}

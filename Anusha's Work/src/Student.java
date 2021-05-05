public class Student {
    String name;
    int roll_no;

    public static void main(String[] args) {
        Student stuObj=new Student();//creating Object for Student class
        stuObj.name="John";
        stuObj.roll_no=2;
        System.out.println("Student Name is: "+stuObj.name);
        System.out.println("Student RollNo is: "+ stuObj.roll_no);
        

    }
}

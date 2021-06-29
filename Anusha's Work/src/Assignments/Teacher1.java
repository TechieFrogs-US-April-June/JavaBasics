package Assignments;

public class Teacher1 {
    String designation = "Teacher";
    String collegeName = "ABC";
    void does(){
        System.out.println("Teaching");
    }
}

 class PhysicsTeacher1 extends Teacher1{
    String mainSubject = "Physics";
    public static void main(String args[]){
        PhysicsTeacher1 obj = new PhysicsTeacher1();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}

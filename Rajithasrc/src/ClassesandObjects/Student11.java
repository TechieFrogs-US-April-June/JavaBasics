package ClassesandObjects;
class StudentExample {
    
    String name;
    int roll_no;

}
class Student11{
    public static void main(String[] args){
        StudentExample s =new StudentExample();
        s.name="Gopi";
        s.roll_no=67;
        System.out.println("name is"+s.name+" roll number is"+s.roll_no);
        
    }
}
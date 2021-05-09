package ClassesAndObjectsAssignment;

public class Student {
    private String name;
    private int roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public static void main(String[] args) {
        Student studentObj = new Student();
        studentObj.setName("John");
        studentObj.setRoll_no(2);
        System.out.println("Name : " +studentObj.getName()+ " Roll_no : " +studentObj.getRoll_no());
    }
}

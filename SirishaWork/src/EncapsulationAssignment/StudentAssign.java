package SirishaWork.src.EncapsulationAssignment;


public class StudentAssign {

    private String name;
    private int age;
    private String address;

    public StudentAssign(){
        this.address = "not applicable";
        this.age = 0;
        this.name = "unknown";
    }

    public void setInfo(int age, String name) {
        this.age =age;
        this.name = name;
    }
    public void setInfo(int age, String name, String address){
        this.age = age;
        this.name = name;
        this.address = address;
    }
    public void displayStudent(){
        System.out.println("Student id: "+this.age +"\tName: "+this.name+"\t\tAddress: "+this.address);
    }

    public static void main(String[] args) {
        StudentAssign student1 = new StudentAssign();
        student1.setInfo(5, "Siri");
        student1.displayStudent();
        StudentAssign student2 = new StudentAssign();
        student2.setInfo(5, "siri", "5677 fguhn crt");
        student2.displayStudent();
    }
}

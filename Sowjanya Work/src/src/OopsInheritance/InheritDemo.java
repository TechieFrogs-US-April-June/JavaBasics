package OopsInheritance;

 class Student1 {
    private String designation;
    private String name;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void does() {
        System.out.println("Studying");
    }
}
class Example extends Student1 {
    String subject;
}
public class InheritDemo {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.setName("Sowji");
        obj.setDesignation("Student");

        System.out.println(obj.getName());
        System.out.println(obj.getDesignation());
        obj.does();
    }


}

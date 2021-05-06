package ClassesAndObjectsAssignment;

public class Student1 {

    private int roll_number;
    private long phone_number;
    private String address;
    private String name;

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void studentDetails() {
        System.out.println("name: " +getName()+ " roll number: " +getRoll_number()+ " phone number: " +getPhone_number()+ " address: " +getAddress());
    }

    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.setName("Sam");
        obj.setRoll_number(1);
        obj.setPhone_number(876608180);
        obj.setAddress("20 Broad Street");

        Student1 obj1 = new Student1();
        obj1.setName("John");
        obj1.setRoll_number(5);
        obj1.setPhone_number(576524890);
        obj1.setAddress("60 Main Street");

        obj.studentDetails();
        obj1.studentDetails();
    }
}

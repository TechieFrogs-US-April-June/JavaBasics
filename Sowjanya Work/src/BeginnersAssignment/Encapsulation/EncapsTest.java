package BeginnersAssignment.Encapsulation;

public class EncapsTest {

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("sowji");
        obj.setEmpAge(30);
        obj.setSsn(123456);


        System.out.println("Employee Age: " +obj.getEmpAge());
        System.out.println("Employee Name: " +obj.getEmpName());
        System.out.println("Employee SSN: " +obj.getSsn());

    }
}

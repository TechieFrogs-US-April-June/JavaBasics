package OopsEncapsulation;

class EncapsTest {
    private int number;
    private String empName;
    private int empAge;

    public int getNumber() {
        return number;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
    public void setNumber(int newValue) {
        number = newValue;
        //this.number = newValue;
    }

    public void setEmpName(String newValue) {
        empName = newValue;
        //this.empName = newValue;
    }

    public void setEmpAge(int newValue) {
        empAge = newValue;
       // this.empAge = newValue;
    }
}
public class EncapsulationDemo {

    public static void main(String[] args) {
        EncapsTest encaps = new EncapsTest();
        encaps.setEmpAge(25);
        encaps.setEmpName("James");
        encaps.setNumber(1);

        System.out.println(encaps.getNumber()+ " " +encaps.getEmpName()+ " " +encaps.getEmpAge());
    }
}

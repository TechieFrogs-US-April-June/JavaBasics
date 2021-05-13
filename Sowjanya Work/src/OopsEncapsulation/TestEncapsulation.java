package OopsEncapsulation;

class AccountTest {
    private long acc_no;
    private String name,email;
    private float amount;

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

public class TestEncapsulation {

    public static void main(String[] args) {
        //creating instance of AccountTest class
        AccountTest testObj = new AccountTest();

        //setting values through setter methods
        testObj.setAcc_no(56789045);
        testObj.setName("Sowjanya");
        testObj.setEmail("sowjanya@gmail.com");
        testObj.setAmount(75890.78f);

        //getting values through getter methods
        System.out.println("Acc_no: " +testObj.getAcc_no());
        System.out.println("Name: " +testObj.getName());
        System.out.println("Email: " +testObj.getEmail());
        System.out.println("Amount: " +testObj.getAmount());


    }


}

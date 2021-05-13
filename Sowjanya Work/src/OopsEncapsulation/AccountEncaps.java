package OopsEncapsulation;

public class AccountEncaps {
    private float  accountBalance = 500.00f;

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public float CheckBalance(float accountBalance) {
        return this.accountBalance = accountBalance;
    }


    public static void main(String[] args) {
        AccountEncaps accObj = new AccountEncaps();
        accObj.setAccountBalance(35000.50f);
        System.out.println(accObj.getAccountBalance());
        accObj.CheckBalance(7200.75f);
        System.out.println(accObj.getAccountBalance());
    }
}

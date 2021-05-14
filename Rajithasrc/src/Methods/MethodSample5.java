package Methods;

class Customer{
    private String name;
    private String Phoneno;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneno() {
        return Phoneno;
    }
    public void setPhoneno(String phoneno) {
        Phoneno = phoneno;
    }

}
class Account{
    private int accountno;
    private double balance;
	public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    private double interest;

	public Account()
	{
		balance = 0;
		interest = 0;
	}

	public Account(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}
}
class RBI{
    private Customer c;
    private Account a;

    public Customer getC() {
        return c;
    }
    public void setC(Customer c) {
        this.c = c;
    }
    public Account getA() {
        return a;
    }
    public void setA(Account a) {
        this.a = a;
    }
    public double getInterestRate() { 
        return 4;
    }
    public double getWithdrawalLimit() {
         return 6000;
        }
}
class SBI extends RBI {
    public double getWithdrawalLimit() { 
        return 2000;
    }
}

class ICICI extends RBI {
    public double getInterestRate() { 
        return 6; 
    }
    public double getWithdrawalLimit() { 
        return 4000;
    }
}
public class MethodSample5 {
    public static void main(String[] args) {
        Customer cusobj = new Customer();
        cusobj.setName("Sam");
        cusobj.setPhoneno("+1-345-4335325");

        Account accobj = new Account(5000,.10);
        accobj.setAccountno(435435453);
        
        //accobj.withdraw(200);
		//accobj.deposit(600);
		//accobj.addInterest();
		//System.out.println(accobj.getBalance());


        SBI sbiobj = new SBI();
        sbiobj.setA(accobj);
        sbiobj.setC(cusobj);

        sbiobj.getA().withdraw(100.00);
        System.out.println("Balance after withdrawl from SBI account  " +sbiobj.getA().getBalance());
        sbiobj.getA().deposit(20000.00);
        System.out.println("Balance after depositing to SBI account  " +sbiobj.getA().getBalance());
        sbiobj.getA().addInterest();
        System.out.println("Balance after interest SBI account  " +sbiobj.getA().getBalance());
      
       ICICI iciciobj = new ICICI();
       iciciobj.setA(accobj);
       iciciobj.setC(cusobj);

        iciciobj.getA().withdraw(200.00);
        System.out.println("Balance after withdrawl from ICICI account  " +iciciobj.getA().getBalance());
        iciciobj.getA().deposit(40000.00);
        System.out.println("Balance after depositing to ICICI account  " +iciciobj.getA().getBalance());
        iciciobj.getA().addInterest();
        System.out.println("Balance after interest ICICI account  " +iciciobj.getA().getBalance());


    
}
}

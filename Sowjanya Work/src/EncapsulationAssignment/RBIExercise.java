package EncapsulationAssignment;

class Customer {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Account {
    private int accNumber;
    private double balance;
    private int customerId;

    public void credit(double amount) {
        this.balance += amount;
    }

    public void addInterest(double interestRate) {
        double interest = this.balance * interestRate / 100;
        this.balance += interest;
    }

    public void debit(double amount, double withdrawlLimit) {
        if(amount < withdrawlLimit) {
            if (amount <= this.balance) {
                this.balance = this.balance - amount;
            } else {
                System.out.println("Amount exceeds account balance");
            }
        } else {
            System.out.println("Amount exceeds the withdrawl limit");
        }
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}

class RBI {
    private Customer cust;
    private Account acct;

    public double getInterestRate() { return 4;}
    public double getWithdrawalLimit() { return 5000;}

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Account getAcct() {
        return acct;
    }

    public void setAcct(Account acct) {
        this.acct = acct;
    }
}
class SBI extends RBI {
    public double getWithdrawalLimit() { return 2000;}
}

class ICICI extends RBI {
    public double getInterestRate() { return 5; }
    public double getWithdrawalLimit() { return 4000;}
}
public class RBIExercise {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("John");
        customer.setAddress("69 Main Street");

        Account account = new Account();
        account.setAccNumber(123456);
        account.setCustomerId(1);

        SBI sbi = new SBI();
        sbi.setAcct(account);
        sbi.setCust(customer);
        sbi.getAcct().credit(500);
        System.out.println("Balance of SBI Account: "+sbi.getAcct().getBalance());
        sbi.getAcct().debit(5000, sbi.getWithdrawalLimit());
        System.out.println("Balance of SBI Account: "+sbi.getAcct().getBalance());
        sbi.getAcct().addInterest(sbi.getInterestRate());
        System.out.println("Balance of SBI Account: "+sbi.getAcct().getBalance());
        sbi.getAcct().credit(50000);
        System.out.println("Balance of SBI Account: "+sbi.getAcct().getBalance());
        sbi.getAcct().addInterest(sbi.getInterestRate());
        System.out.println("Balance of SBI Account: "+sbi.getAcct().getBalance());
    }
}

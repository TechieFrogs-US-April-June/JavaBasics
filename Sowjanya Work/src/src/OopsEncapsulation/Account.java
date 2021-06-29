package OopsEncapsulation;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    Account(String id, String name) {
       this.id = id;
       this.name = name;
    }
    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    int credit(int amount) {
        this.balance = this.balance + amount;
        return this.balance;
    }

    int debit(int amount) {
        if(amount <= this.balance) {
            this.balance = this.balance - amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    int transferTo(Account another , int amount) {
        if(amount <= this.balance) {
            this.balance = this.balance - amount;
            another.balance = another.balance+amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account accObj = new Account("001", "John", 50000);
        Account accObj1 = new Account("005", "Sam", 25000);
        System.out.println("John balance: " + accObj.credit(8999));
        System.out.println("John balance: " + accObj.debit(2000));
        System.out.println("John balance: " +accObj.getBalance());
        System.out.println("Sam balance: " + accObj1.transferTo(accObj,5000));
        System.out.println("John balance: " +accObj.getBalance());
        System.out.println("Sam balance: " +accObj1.getBalance());

    }

}

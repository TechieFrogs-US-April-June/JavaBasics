package EncapsulationAssignment;

class Bank {
    public int getBalance() {
        return 0;
    }
}
class BankA extends Bank{
    public int getBalance() {
        return 1000;
    }
}
class BankB extends Bank{
    public int getBalance() {
        return 1500;
    }
}
class BankC extends Bank{
    public int getBalance() {
        return 2000;
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bnk = new Bank();
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Balance in Bank: "+bnk.getBalance());
        System.out.println("Balance in BankA: "+bankA.getBalance());
        System.out.println("Balance in BankB: "+bankB.getBalance());
        System.out.println("Balance in BankC: "+bankC.getBalance());
    }
}

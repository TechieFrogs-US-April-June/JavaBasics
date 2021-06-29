package AbstractAssignment;

abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    private int balance;

    void deposit(int money) {
        balance += money;
    }

    int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance;

    void deposit(int money) {
        balance += money;
    }

    int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance;

    void deposit(int money) {
        balance += money;
    }

    int getBalance() {
        return balance;
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.deposit(100);
        bankB.deposit(200);
        bankC.deposit(300);

        System.out.println("A value: " + bankA.getBalance() + "$");
        System.out.println("B value: " + bankB.getBalance() + "$");
        System.out.println("C value: " + bankC.getBalance() + "$");

        bankA.deposit(600);
        bankB.deposit(900);
        bankC.deposit(1000);

        System.out.println("A value: " + bankA.getBalance() + "$");
        System.out.println("B value: " + bankB.getBalance() + "$");
        System.out.println("C value: " + bankC.getBalance() + "$");
    }

}

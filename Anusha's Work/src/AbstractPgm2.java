abstract class Bank{
    abstract void getBalance();
    }

class BankA extends Bank{
    void getBalance(){
        System.out.println("Money Deposited in Bank A:$100");
    }
}
class BankB extends Bank{
    void getBalance(){
        System.out.println("Money Deposited in Bank A:$150");
    }
}
class BankC extends Bank{
    void getBalance(){
        System.out.println("Money Deposited in Bank A:$200");
    }
}


public class AbstractPgm2 {
    public static void main(String[] args) {
        BankA bankAObj=new BankA();
        bankAObj.getBalance();
        BankB bankBObj=new BankB();
        bankBObj.getBalance();
        BankC bankCObj=new BankC();
        bankCObj.getBalance();
    }
}

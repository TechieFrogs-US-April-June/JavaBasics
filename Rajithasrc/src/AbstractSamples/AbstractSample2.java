package AbstractSamples;

abstract class Bank{
    abstract void getBalance();
}

class BankA extends Bank{
    int balance=100;
    public void getBalance(){
    System.out.println("BankA account balance is $"+balance);
    }
}
class BankB extends Bank{
    int balance=150;
    public void getBalance(){
    System.out.println("BankB account balance is $"+balance);
    }
}
class BankC extends Bank{
    int balance=200;
    public void getBalance(){
    System.out.println("BankC account balance is $"+balance);
    }
}
public class AbstractSample2 {
    public static void main(String[] args) {
        BankA baobj= new BankA();
        baobj.getBalance();
        BankB bbobj=new BankB();
        bbobj.getBalance();
        BankC bcobj= new BankC();
        bcobj.getBalance();
    }
    
}

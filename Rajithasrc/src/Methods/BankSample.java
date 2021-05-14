package Methods;

class Bank{
    int Amount=0;
public void getBalance(){
    System.out.println("Initial Balance is $"+Amount);
}

}

class BankA extends Bank{
    int Amount=1000;
public void getBalance(){
    System.out.println("Balance in BankA is $"+Amount);
}

}

class BankB extends Bank{
    int Amount=1500;
    public void getBalance(){
        System.out.println("Balance in BankB is $"+Amount);
    }
    
}

class BankC extends Bank{
    int Amount=2000;
public void getBalance(){
    System.out.println("Balance in BankC is $"+Amount);
}

}
public class BankSample {

    public static void main(String[] args) {

        BankA a = new BankA();
        a.getBalance();
        BankB b = new BankB();
        b.getBalance();
        Bank c = new BankC();
        c.getBalance();
        
    }
    
}

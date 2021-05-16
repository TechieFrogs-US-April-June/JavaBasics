package src.AbstractExercises;
//Q2
abstract class Bank {

    abstract void getBalance(); //Abstract method cannot have body
    
}

class BankA extends Bank{
 
    void getBalance(){
        int a = 100;
        System.out.println("Deposited Amount in BankA : " + a);
    }
}

class BankB extends Bank{
    void getBalance(){
        int b= 150;
        System.out.println("Deposited Amount in BankB : " + b);
    }

}
class BankC extends Bank{
    void getBalance(){
        int c = 200;
        System.out.println("Deposited Amount in BnakC : " + c);
    }
}

class MyAbstractClass{
    public static void main(String[] args) {
        BankA A = new BankA();
        A.getBalance();

        Bank B =new BankB();
        B.getBalance();

        BankC C = new BankC();
        C.getBalance();

        
    }
}
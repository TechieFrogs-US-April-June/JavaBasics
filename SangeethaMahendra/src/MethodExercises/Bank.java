package src.MethodExercises;

public class Bank {
    private int balance =0;
    void getBalance(){
        System.out.println(" Bank Balance $" + balance);
    }
}

     class BankA{
       private int b1 =1000;
        void getBalance(){
        System.out.println(" Bank Balance $" + b1);
        }

     }
     class BankB{
        private int b2 =1500;
        void getBalance(){
        System.out.println(" Bank Balance $" + b2);
        
        }
     }
     class BankC{
       private int b3 =2000;
        void getBalance(){
            System.out.println(" Bank Balance $" + b3);
        }
     }

     class display1{
         public static void main(String[] args) {
           
                // Bank B = new Bank();
                // B.getBalance();
         
                BankA bA = new BankA();
                bA.getBalance();

                BankB bB = new BankB();
                bB.getBalance();

                BankC bC = new BankC();
                bC.getBalance();
            
         }
     }



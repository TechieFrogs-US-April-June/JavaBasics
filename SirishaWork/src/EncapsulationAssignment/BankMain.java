package SirishaWork.src.EncapsulationAssignment;

class Bank {
        public int getBalance() {
            return 0;
        }
    }
    class BankA extends Bank{
            public int getBalance(){
                return 1000;
            }
    }
    class BankB extends Bank{
            public int getBalance(){
                return 1500;
            }
    }
    class BankC extends Bank{
            public int getBalance(){
                return 2000;
            }
    }
    public class BankMain {
        public static void main(String[] args) {
            Bank bnk = new Bank();
            BankA bnkA = new BankA();
            BankB bnkB = new BankB();
            BankC bnkC = new BankC();

            System.out.println("Balance in Bank: "+bnk.getBalance());
            System.out.println("Balance in BankA: "+bnkA.getBalance());
            System.out.println("Balance in BankB: "+bnkB.getBalance());
            System.out.println("Balance in BankC: "+bnkC.getBalance());
        }
    }




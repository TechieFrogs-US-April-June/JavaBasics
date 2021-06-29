package OopsAbstraction;

abstract class Bank {
    abstract int getRateOfInterest(int x);
}

class Sbi extends Bank {
    int getRateOfInterest(int a) {
        return a;
    }
}

class Hdfc extends Bank {
    int getRateOfInterest(int b) {
        return b;
    }
}
public class TestAbs {
    public static void main(String[] args) {
        Bank b = new Sbi();
        System.out.println("Rate of interest: " +b.getRateOfInterest(7)+"%");

        Bank b1 = new Hdfc();
        System.out.println("Rate of interest: " +b1.getRateOfInterest(9)+"%") ;

    }

}

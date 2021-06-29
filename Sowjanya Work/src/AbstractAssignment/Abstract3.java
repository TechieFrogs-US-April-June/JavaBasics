package AbstractAssignment;

abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    private double subj1;
    private double subj2;
    private double subj3;
    A(){}
    A(double subj1, double subj2, double subj3) {
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;
    }
    double getPercentage() {
        double total = this.subj1 + this.subj2 + this.subj3;
        return total/3;
    }
}
class B extends Marks {
    private double subj1;
    private double subj2;
    private double subj3;
    private double subj4;
    B(){}
    B(double subj1, double subj2, double subj3, double subj4) {
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;
        this.subj4 = subj4;
    }
    double getPercentage() {
        double total = this.subj1 + this.subj2 + this.subj3 + this.subj4;
        return total/4;
    }
}
public class Abstract3 {
    public static void main(String[] args) {
        A aObj = new A(55, 69, 78);
        B bObj = new B(55, 84, 99, 62);
        System.out.println("Percentage of Student A: "+aObj.getPercentage());
        System.out.println("Percentage of Student B: "+bObj.getPercentage());
    }
}

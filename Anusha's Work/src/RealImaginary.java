import java.util.Scanner;
public class RealImaginary {
    double r,i;
    RealImaginary(double r,double i){
        this.r=r;
        this.i=i;
    }
    public static void Sum(RealImaginary realImagObj1,RealImaginary realImagObj2){
        RealImaginary realImaObjSum = new RealImaginary( 0, 0);
        realImaObjSum.r = realImagObj1.r + realImagObj2.r;
        realImaObjSum.i = realImagObj1.i + realImagObj2.i;

        System.out.println("Sum of given two complex Numbers is:"+ realImaObjSum.r+"+"+realImaObjSum.i+"i");
    }
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter Complex Number(a+bi) 1:");
        double num1=sc.nextDouble();
        System.out.println("Enter Complex Number(a+bi) 2:");
        double num2=sc.nextDouble();*/
        RealImaginary realImagObj1=new RealImaginary(2.5,4.5);
        RealImaginary realImagObj2=new RealImaginary(7.6,5.5);
        RealImaginary.Sum(realImagObj1,realImagObj2);
    }
}

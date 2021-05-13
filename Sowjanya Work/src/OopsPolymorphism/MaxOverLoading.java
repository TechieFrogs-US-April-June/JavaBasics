package OopsPolymorphism;

public class MaxOverLoading {
    void max(int a, int b) {
        if(a>b){
            System.out.println("Max number: "+a);
        } else if(a<b) {
            System.out.println("Max Number: "+b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    void max(double a, double b) {
        if(a>b){
            System.out.println("Max number: "+a);
        } else if(a<b) {
            System.out.println("Max Number: "+b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    void max(int a, int b, int c) {

    }
}

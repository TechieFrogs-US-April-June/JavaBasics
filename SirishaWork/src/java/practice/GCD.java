package SirishaWork.src.java.practice;

public class GCD {
    public static void main(String[] args) {

        int a = 130, b = 46;

        while (a != b) {
            if (a > b){
                a = a - b;
        }
            else{
            b = b - a;
        }
        }

        System.out.printf("GCD of given numbers is: %d%n", a);
    }

}


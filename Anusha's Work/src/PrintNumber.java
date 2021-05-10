import java.util.Scanner;

class Printing{
    void print(byte a){
        System.out.println(a+" "+ " is a Byte");
    }
    void print(short a){
        System.out.println(a+" "+ " is a Short");
    }
    void print(int a){
        System.out.println(a+" "+ " is an Integer");
    }
    void print(long a){
        System.out.println(a+" "+ " is a Long");
    }
    void print(float a){
        System.out.println(a+" "+ " is a Float Number");
    }
    void print(double a){
        System.out.println(a+" "+ " is a double");
    }
    void print(boolean a){
        System.out.println(a+" "+ " is a boolean");
    }
    void print(char a){
        System.out.println(a+" "+ " is a Character");
    }

}

public class PrintNumber {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        String a= sc.nextLine();*/
        Printing printObj=new Printing();
        printObj.print(10.0d);
    }
}

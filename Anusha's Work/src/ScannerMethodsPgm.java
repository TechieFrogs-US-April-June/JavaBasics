import java.util.Scanner;

public class ScannerMethodsPgm {
    public static void main(String[] args) {
       findInLinepgm1();
       findInLinePgm2();
    }


    public static void findInLinepgm1() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Input:");
        System.out.println(" " + sc.findInLine("Java"));
        System.out.println(" " + sc.nextLine());
        sc.close();
    }
    public static void findInLinePgm2(){
        String str="JAVA is an object oriented programming language ";
        Scanner sc=new Scanner(str);
        System.out.println(" "+ sc.findInLine("oriented"));
        System.out.println(" " + sc.nextLine());
        sc.close();
    }


}

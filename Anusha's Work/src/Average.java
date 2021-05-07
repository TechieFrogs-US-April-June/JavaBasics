import java.util.Scanner;

public class Average {
    float avg;
    void avgofnumbers(int a, int b, int c){
        avg=(float) (a+b+c)/3;
        System.out.println(avg);
        System.out.println("Average of "+a+" "+b+" "+c+"is:"+avg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b,c values:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        Average avgObj=new Average();
        avgObj.avgofnumbers(a,b,c);
    }
}

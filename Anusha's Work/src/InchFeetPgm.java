import java.util.Scanner;
class distance{
public void addDistance(int a,int b){
        int sum=a+b;
        System.out.println("Distance in inches:"+ sum);
    System.out.println("Distance in feet:"+sum/12);
        }
}
public class InchFeetPgm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two units to add in inches:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        distance distanceObj=new distance();
        distanceObj.addDistance(a,b);


    }
}

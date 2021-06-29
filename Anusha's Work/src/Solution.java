import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int n=inputNumValidation();
        //computeSum(a);
        System.out.println("Sum of Natural Numbers up to "+ n +" is: "+computeSum(n));
    }
    public static int inputNumValidation(){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        do{
           // System.out.println("Enter any number:");
            a= sc.nextInt();
            if(a<=0){
                System.out.println("Invalid Number...Please Enter Valid Number:");
                //System.out.println("Enter any number:");
            }
        }while(a<=0);
        return a;
    }
    public static int computeSum(int inputNum){
        int Sum=0;
        for(int i=inputNum;i>=1;i--){
            Sum=Sum+i;
        }
        return  Sum;
    }

}

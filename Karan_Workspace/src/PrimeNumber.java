import java.util.Scanner;

public class PrimeNumber {
    static int a;
    static void numcheck(){
        while(true){
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()){
                a=scan.nextInt();
                break;
                // if(a<0){
                //     System.out.println("Please enter a positive INTEGER");
                // }
            }
            System.out.println("Please enter a INTEGER");
        }
    }
    public static void main(String[] args) {
        int i;
        System.out.println("Please enter a number to check if it is PRIME / not :: ");
     numcheck();
        if(a==0 | a==1 | a<0){
            System.out.println(a +"  is not a prime number");
        }else{
            for (i=2; i<=a ; i++){
                if(a%i==0)
                System.out.println(a +"  is not a prime number");
            }
        }

        
    }
}

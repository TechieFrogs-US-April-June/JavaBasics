import java.util.Scanner;
public class GCD_LCM {
    static int a,b,x,y,gcd_res,lcm_res;

    static void number1(){
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter FIRST number :: ");
            if(scan.hasNextInt()){
                 a = scan.nextInt();
                break;
            }
            System.out.println("Please enter an INTEGER value..!");
        }
    }

    static void number2(){
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter Second number :: ");
            if(scan.hasNextInt()){
                 b = scan.nextInt();
                break;
            }
            System.out.println("Please enter an INTEGER value...!");
        }
    }

    static void gcd(){
        number1();
        number2();
            for(int i = 1; i <= a && i <= b; i++)
            {
                if(a%i==0 && b%i==0);
                     gcd_res = i;
            }
            System.out.printf("The result of GCD is :: "+ gcd_res + "\n");
        }

    static void lcm(){
        gcd();
        lcm_res= (a*b)/gcd_res;
        System.out.println("The result of LCM is :: "+ lcm_res);
    }

    public static void main(String[] args) {

        System.out.println("Please enter your choice ::  \n");
        System.out.println("OPTION 1 --> GCD \nOPTION 2 --> LCM");
        while(true){
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()){
                x=scan.nextInt();
                 if(x==1 | x==2){
                     System.out.println("COMPUTING your request.....");
                     switch(x){
                        case 1:
                        System.out.println("****GCD****");
                        gcd();
                        System.exit(1);
                        break;
                        case 2:
                        System.out.println("****LCM****");
                        lcm();
                        System.exit(1);
                        break;
                    }
                 }
                 else{
            System.out.println("Please s of the choice displayed");
            System.out.println("OPTION 1 --> GCD \nOPTION 2 --> LCM");}
            }
            else{
            System.out.println("Please select either of the choice displayed");
            System.out.println("OPTION 1 --> GCD \nOPTION 2 --> LCM");}
    }
}
}

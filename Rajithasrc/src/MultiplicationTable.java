package src;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5;
        int m = 0;
        for (int i = 1; i <= 10; i++) {
            m = n * i;
            System.out.println(m);

            System.out.println(n + "*" + i + "=" + m);//n + "*" + i + " = " + (n * i));
        }
    }
}

        /* int i=1;
           while(i<=10){
           System.out.println(n*i);
           i++;
        */
    /*Scanner sc=new Scanner(System.in);
    System.out.println("Enter integer n");
    int n=sc.nextInt();
    System.out.println("n value is"+n);
    System.out.println("Enter integer m");
    int m=sc.nextInt();
    System.out.println("m value is"+m);
    */


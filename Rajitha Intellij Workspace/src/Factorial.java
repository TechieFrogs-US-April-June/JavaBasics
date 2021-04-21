package src;

public class Factorial {
    public static void main(String[] args){
        int n=5;//
        int f=1;
        for(int i=1;i<=n;i++) // 1<=5  2<=5 3<=5 4<=5 5<=5
            f=f*i;//f=1*1=1 f=1*2=2 f=2*3=6 f=6*4=24 f=24*5=120
System.out.println("Program for factorial");
        System.out.print(f);
        /* int i=1;
        while(i<=n)
        {
        f=f*i;
        System.out.println(f);
        }
         */
        /* int fact=1;
        for(int i=5;i>1;i--){
        System.out.println(i);

        fact=fact*1;
        }
        System.out.println(fact);
         */
    }
    
}

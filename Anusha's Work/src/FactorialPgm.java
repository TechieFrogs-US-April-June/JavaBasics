public class FactorialPgm {
    public static void main(String[] args) {

        //for loop
        int factorial=1;
        for(int i=5;i>1;i--)
        {
            System.out.println(i);//5,4,3,2,1
             factorial  = factorial*i;   //  1*5=5,5*4=20,20*3=60,60*2=120,120*1
        }
        System.out.println(factorial);



        //while loop
        int factorial1=1;
        int j=5;
        while(j>1)
        {
            factorial1 = factorial1*j;
            j--;
        }
        System.out.println(factorial1);
    }
}

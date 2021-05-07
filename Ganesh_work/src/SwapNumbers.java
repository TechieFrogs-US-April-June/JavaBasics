public class SwapNumbers {
    public static void main(String[] args) {
        int x=10,y=20;
       /* int swapvar;
        swapvar=x;
        x=y;
        y=swapvar;
        System.out.println("Value of x after Swapping is " + x);
        System.out.println("Value of y after Swapping is " + y);*/

       //=x+y;//x=30
        //x-y;//y=20
       //// =x-y;//x=10
       x=x*y;
       y=x/y;
       x=x/y;
        System.out.println("Value of x after Swapping is " + x);
        System.out.println("Value of y after Swapping is " + y);

    }
}

public class SumOfNumbers {
    public static void main(String[] args) {
        //using formula
        int x=10;
        int sum=(x*(x+1))/2;
        System.out.println(sum);


        //for loop
        int num=0;
        int y=10;
        for(int i=y;i>=1;i--)
        {
          //  System.out.println(i);
            num=num+i;
        }
        System.out.println(num);



        //while loop
        int z=10;
         int number=0;
        while(z>=1)
        {
            number=number+z;
            z--;
        }
        System.out.println(number);




    }
 
}

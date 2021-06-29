package src.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Array declaration
        int a[] = {10,20,30,40};
        int[] s = {100,200,300,400};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(s[2]);
        System.out.println(s[3]);

        //another way not recommanded //if store 100 values this wont work
        int u[] = new int [3];
        u[0] = 10;
        u[1] = 20;
        u[2] = 30;
        for(int temp : u){
            System.out.println(temp);
        }

      // HOW TO FIND OUT ARRAY-LENGTH
      int b[] = {10,20,30};
      System.out.println(b.length); // length keyword is used to find out array length

      //HOW TO FIND OUT ARRAY LENTH WITHOUT USING USING PRE-DEFINED PROPERTY

      int c[] ={10,20,30,40,50};
      int len =0;
      for(int t: c)  //
         {
            len++;
         }
      System.out.println(len);
    }
}

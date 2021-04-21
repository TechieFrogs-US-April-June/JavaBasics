public class Operatos {
    public static void main(String[] args){

        /*int i = 5;//Unary - Increment operators
        int b = 10;
        System.out.println(++i);//6
        System.out.println(i);//6
        System.out.println(i++);//6
        System.out.println(i);//7
        System.out.println(i++ + ++b);//7+11=18
        System.out.println(b++ + b++);//11+12=23
        */

        /*int i = 10;//Unary- Decrement Operators
        System.out.println(--i);//9
        System.out.println(i);//9
        System.out.println(i--);//9
        System.out.println(i);//8
        */

        /*int a = 5;//Unary - Bitwise complement and !
      int b = -9;
      boolean c = true;
      boolean d = false;
        System.out.println(~a);//-6(minus of total positive value which starts from 0)
        System.out.println(~b);//8(positive of total minus, positive starts from 0)
        System.out.println(!c);//false(opposite of boolean value)
        System.out.println(!d);//true(opposite of boolean value)
       */

        /*int a=10;//Arithmetic operators
        int b=5;
        System.out.println(a+b);//15
        System.out.println(a-b);//5
        System.out.println(a*b);//50
        System.out.println(a/b);//2
        System.out.println(a%b);//0
       */

         /* //Left shift operators
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

        //Right shift operators
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2
       */

        /*int a=10;//Logical && and Bitwise &
        int b=5;
        int c=20;
        System.out.println(a<b && a<c);// false && = false (a<c second condition in not checked bcoz first one is false)
        System.out.println(a<b & a<c);//false & true = false(checks both conditions if true or false)
        */

        /*int a=10;//Logical || and Bitwise |
        int b=5;
        int c=20;
        System.out.println(a>b || a<c);//true || = true(a<c second condition is not checked bcoz first one is true)
        System.out.println(a>b | a<c);//true | true = true(checks both conditions if true or false)
       */

        /*int a=2;//Ternary operator
        int b=5;
        int min=(a<b)?a:b;//if(a<b) condition is true it executes a value, if (a<b) condition is false it executes b value
        System.out.println(min);
        */

        /*int a=10;//Assignment operator
        int b=20;
        a+=4;;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b); */

        /*short a2=10;
        int b2=10;
        int c2;
        a2=20;
       b2 = a2+b2;
       a2 = (short)(a2+b2);
        System.out.println(a2);

         */

        /*byte byteValue = 50;
        short shortValue = 1000;
        int intValue = 123456;
        long longValue = 50000 + (10 * (byteValue+ shortValue + intValue));
        System.out.println(longValue);
        

        //Converting a given number of pounds to kilograms
        double poundValue = 5;
        double kilogram = 0.45359237d;
        double convertedKilogram = poundValue * kilogram;
        System.out.println("converted kilograms = " + convertedKilogram);


        int x = 5;
        //x ^= 3;//x = x ^ 3
        x |= 3;// x = x | 3
        System.out.println(x);

         */
        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println(a + " " + b + " " + c);



    }
}

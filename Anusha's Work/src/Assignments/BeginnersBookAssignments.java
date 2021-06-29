package Assignments;

import java.util.Scanner;

public class BeginnersBookAssignments {

        public static void main(String[] args) {
            //readaNoPgm1();
            //positiveOrNegativePgm2();
            //addTwoNumbersPgm3();
            //asciiOfCharPgm4();
            // multiplyNumsPgm5();
            //areaOfTrianglePgm6();
            // largestOfNumbersPgm7();
            //evenOrOddPgm8();
            // vowelOrConsonantPgm9();
            //arithmeticOperationsPgm10();
            //ternary1Pgm11();
            //ternary2Pgm12();
            //naturalNumbersPgm13();
            //factorialOfNumPgm14();
            //fibonacciPgmPgm15();
            //fibonacciUsingWhilePgm16();
            //doWhilePgmPgm17();
            //continuePgm18();
            //breakPgm19();
            switchPgm20();


        }
        public static void readaNoPgm1(){
            System.out.println("Enter any number:");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println("Entered Number is: "+a);

        }
        public static void positiveOrNegativePgm2(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any Number:");
            int a=sc.nextInt();
            if(a==0){
                System.out.println(" Given Number is Zero");
            }else
            if(a>0){
                System.out.println(a +" is a Positive Number");
            }else
            if(a<0){
                System.out.println(a +" is a Negative Number");
            }
        }
        public static void addTwoNumbersPgm3(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any two Numbers to Add:");
            int a=sc.nextInt();
            int b= sc.nextInt();
            int Sum=a+b;
            System.out.println("Addition of "+a+" and "+b+" is: "+Sum);
        }
        public static void asciiOfCharPgm4(){
            char ch='A';
            int ascii=ch;
            int asciiVlaue=(int)ch;
            System.out.println(" ASCII value of 'A' is "+asciiVlaue);
        }
        public static void multiplyNumsPgm5(){
            System.out.println("Enter any two Numbers to Multiply:");
            Scanner sc=new Scanner(System.in);
            double a=sc.nextDouble();
            double b= sc.nextDouble();
            double Mul=a*b;
            System.out.println("Multiplication of "+a+" and "+b+" is: "+Mul);
        }
        public static void areaOfTrianglePgm6(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Base and Height of A Triangle:");
            double b=sc.nextDouble();
            double h= sc.nextDouble();
            double AreaOfTriangle=0.5*b*h;
            System.out.println("Area Of Triangle is:"+AreaOfTriangle);
        }
        public static void largestOfNumbersPgm7(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any Three Numbers to find Greatest ");
            double a1=sc.nextDouble();
            double a2= sc.nextDouble();
            double a3= sc.nextDouble();
            if( a1 >= a2 && a1 >= a3)
                System.out.println(a1+" is the largest Number");

            else if (a2 >= a1 && a2 >= a3)
                System.out.println(a2+" is the largest Number");

            else
                System.out.println(a3+" is the largest Number");
        }
        public static void evenOrOddPgm8(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any Number to Check whether it is Even or Odd: ");
            double a1=sc.nextDouble();
            if(a1%2==0){
                System.out.println(a1+"Is a Even NUmber");
            }else{
                System.out.println(a1+"Is a Odd NUmber");
            }
        }
        public static void vowelOrConsonantPgm9(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any Character: ");
            char ch=sc.next().charAt(0);
            if (ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
                System.out.println(ch + " is vowel");
            } else
                System.out.println(ch + " is consonant");
        }
        public static void arithmeticOperationsPgm10(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter operator:");
            char ch=sc.next().charAt(0);
            System.out.println("Enter two values to perform operation: ");
            int a=sc.nextInt();
            int b= sc.nextInt();
            switch(ch)
            {
                case '+':int Sum=a+b;
                    System.out.println("Addition of two Numbers:"+Sum);
                case '-':int Sub=a-b;
                    System.out.println("Subtraction of two Numbers:"+Sub);
                case '*':int Mul=a*b;
                    System.out.println("Multiplication of two Numbers:"+Mul);
                case '/':int Div=a/b;
                    System.out.println("Divison of two Numbers:"+Div);
            }
        }
        public static void ternary1Pgm11(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter three Numbers:");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double temp=(a>b?a:b);
            double result=c>temp?c:temp;
            System.out.println(" Greatest Among three NUmbers:"+result);
        }
        public static void ternary2Pgm12(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter three Numbers:");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double temp=(a<b?a:b);
            double result=c<temp?c:temp;
            System.out.println(" Greatest Among three Numbers:"+result);
        }
        public static void naturalNumbersPgm13(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any Number:");
            int n= sc.nextInt();
            int count=0;
            for(int i=1;i<=n;i++){
                count=count+i;
            }
            System.out.println("Sum of Natural Numbers"+count);
        }
        public static void factorialOfNumPgm14(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any Number:");
            int n= sc.nextInt();
            int count=1;
            for(int i=1;i<=n;i++){
                count=count*i;
            }
            System.out.println("Factorial of a Given Number is:"+count);
        }
        public static void fibonacciPgmPgm15(){
            int count=10;
            int n1=0;
            int n2=1;
            for(int i=1;i<=count;i++){
                System.out.println(n1+" ");
                int Sum=n1+n2;
                n1=n2;
                n2=Sum;
            }
        }
        public static void fibonacciUsingWhilePgm16(){
            int i=1;
            int count=10;
            int n1=0;
            int n2=1;
            while(i<=count){
                System.out.println(n1+" ");
                int Sum=n1+n2;
                n1=n2;
                n2=Sum;
                i++;
            }
        }
        public static void doWhilePgmPgm17(){
            int i=1;
            do{
                System.out.println(i);
                i++;
            }while(i<=10);
        }
        public static void continuePgm18(){
            for (int j=0; j<=6; j++)
            {
                if (j==4)
                {
                    continue;
                }

                System.out.print(j+" ");
            }
        }
        public static void breakPgm19(){
            int num =0;
            while(num<=100)
            {
                System.out.println("Value of variable is: "+num);
                if (num==2)
                {
                    break;
                }
                num++;
            }
            System.out.println("Out of while-loop");
        }
        public static void switchPgm20(){
            int num=3;

            switch (num)
            {
                case 1:
                    System.out.println("Case 1 ");
                    break;
                case 2:
                    System.out.println("Case 2 ");
                    break;
                case 3:
                    System.out.println("Case 3 ");
                    break;
                default:
                    System.out.println("Default ");
            }
        }

    }


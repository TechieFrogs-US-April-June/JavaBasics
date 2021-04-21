public class Operators {
    public static void main(String[] args) {
        int a=10,b=20,c=30,d=40;
        //addition
        int ADD=a+b;
        System.out.println("Addition of two numbers is" + ADD);
        //subtraction
        int SUB=a-b;
        System.out.println("Subtraction of two numbers is" + SUB);
        //multiplication
        int MUL=a*b;
        System.out.println("MUltiplication of two numbers is" + MUL);
        //Division
        int DIV=a/b;
        System.out.println("Division of two numbers is" + DIV);
        //Modulus
        int MOD=a%b;
        System.out.println("Modulus of two numbers is" + MOD);
        //unary operator

        int a1=11;
        System.out.println("pre-increment" +  ++a1);
        System.out.println("Post-increment" + a1++);
        System.out.println(a1);
        //left shift operator
        System.out.println(10<<4);//(10*2^4=10*16=160)
        //right shift operator
        System.out.println(10>>4);//(10/2^4=10/16=0)

        //ternary operator
        int aa1=20;
        int bb1=30;
        int min=(aa1<bb1)?aa1:bb1;//(a<b)?a:b;
        System.out.println(min);

        //comparison operators
        int x=3,y=5,z=9;
        System.out.println(x<y);
        System.out.println(x>z);
        System.out.println(x==y);
        System.out.println(y<=z);
        System.out.println(y>=z);








    }
}

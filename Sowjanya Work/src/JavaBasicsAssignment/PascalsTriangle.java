package JavaBasicsAssignment;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        int pascal,a,b,c,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many row you want to input: ");
        c=sc.nextInt();
        pascal=1;
        b=0;

        System.out.print("Pascal's Triangle: ");

        while(b<c)
        {
            for(a=40-3*b;a>0;--a)
                System.out.print(" ");
            for(x=0;x<=b;++x)
            {
                if((x==0)||(b==0))
                    pascal=1;
                else
                    pascal=(pascal*(b-x+1))/x;
                System.out.print("      ");
                System.out.print(pascal);
            }

            System.out.println("");
            ++b;
        }

    }
}

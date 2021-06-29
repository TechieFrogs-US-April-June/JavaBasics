package src.Assignments;
//Q23.	Program to print pyramid using numbers

public class FullPyramidUsingNumbers {
    public static void main(String[] args) {
        int n = 5, i, j, num = 1, space;
 
        space = n - 1; // 5-1 =4; space =4;
 
        for ( j = 1 ; j <= n ; j++ ) // j<=5; 1+1=2        {
        num = j;  // 2 =2;
         
        for ( i = 1 ; i <= space ; i++ ) //1<=4; 1+1=2
            System.out.print(" ");
         
        space --; // 4-1 =3
         
        for ( i = 1 ; i <= j ; i++ ) 
        {
            System.out.print(num + " ");
            num++;
        }
        num--;
        num--;
        for ( i = 1 ; i < j ; i++)
        {
            System.out.print(num + " ");
            num--;
        }
        System.out.println();
        }
    }



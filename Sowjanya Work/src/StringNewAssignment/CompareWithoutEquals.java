package StringNewAssignment;

import java.util.Scanner;

public class CompareWithoutEquals {
    public static void main(String[] args) {
        String s1;
        String s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        s1=sc.nextLine();
        System.out.println("Enter 2nd string: ");
        s2=sc.nextLine();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int len1 = s1.length();
        int len2 = s2.length();

        boolean flag = true;

        if(len1 == len2)
        {
            for(int i=0;i<len1;i++)
            {
                if(c1[i] != c2[i])
                {
                    flag = false;
                    break;
                }
            }
        }
        else
        {
            flag = false;
        }
        if(flag == true)
        {
            System.out.println(s1+ "=" +s2);
            System.out.println("Two strings are equal");
        }
        else
        {
            System.out.println(s1+ "!=" +s2);
            System.out.println("Two strings are not equal");
        }

    }

}



public class SwapTwoNumber {
    
    public static void main(String[] args)
    {
        //Swap with third Variable
        int a = 5000;
        int b = 1500;
        int c = 2000;
        System.out.println("Before Swapping a and b : " + a + " " + b);
        c = a;
        a = b;   
        b = c;     
        System.out.println("After  Swapping a and b : "+  a +" " + b);
        //System.out.println(c +" " + b);

        //Swap without third Variable
        int a1 = 1000;
        int b1 = 4000;
        System.out.println("Before Swapping a1 and b1 : " + a1 + " " + b1);
        a1 = a1 + b1; //1000+4000 = 5000; a1=5000;
        b1 = a1 - b1; // 5000-4000 = 1000; b1 =1000;
        a1 = a1 - b1; // 5000-1000 = 4000;
        System.out.println("After  Swapping a1 and b1 : "+  a1 +" " + b1);

        //



    }
    
}

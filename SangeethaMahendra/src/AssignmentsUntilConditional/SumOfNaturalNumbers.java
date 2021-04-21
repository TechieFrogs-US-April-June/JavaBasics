

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        int n1 = 1;
        int i;  
        for (i = 0; i<=n; i++) //0<=10; post increment 
        {
            n1 = n1 + i;  // 1=1+0; 2=1+1; 4=2+2
            System.out.println(i); // i=0; i=1; i=2
            System.out.println("Sum of Natural Number " + n1); //n1=1; n1=2; n1=4
            
        }
        
    }
    
}

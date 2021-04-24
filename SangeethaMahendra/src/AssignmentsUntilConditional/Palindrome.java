
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the Number to be Reversed : ");
        int n;
        int remainder = 0;
        int rev = 0;
        int temp = n;
        for(n=0; n>0; n++)
        {
            remainder = n%10; //getting last digit
            rev = rev * 10 + remainder; //
            n = n/10; // getting quocient

        }
        if(temp==rev)
        {
            System.out.println("Palindrome ");
		}
		else
		{
			System.out.println("not palindrome");
        }
        

    }
    
}

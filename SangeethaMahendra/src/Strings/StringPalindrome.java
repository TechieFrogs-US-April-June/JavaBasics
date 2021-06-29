package src.Strings;



//CHECK WHETHER STRING IS PALINDROME OR NOT
//A palindrome String is same after reverse. For example "Madam" , "Racecar" 
public class StringPalindrome {
    public static void main(String[] args) {
        
       String s = new String("madam"); //obj will be created in heap area and ref variable s in stack pointing to heap obj;
       char[] ch = s.toCharArray(); // convert string to charArray {'R', 'a','c','e','c','a','r'} = length is 6
       String temp = "";    //null
       for (int i = ch.length-1; i>=0 ; i--) // i=5 (6-1); 5>=0(y); 5
       {
         temp = temp + ch[i];
       }

      // if(temp == s) // double equals compares whether both varibles hashcode are equals
    if(s.equals(temp))  // equals method compares the content (whats inside in the parentheses)
    {
        System.out.println("Palindrome");
    }
    else 
    {
        System.out.println("Not Palindrome");
    }
    } 
    
}

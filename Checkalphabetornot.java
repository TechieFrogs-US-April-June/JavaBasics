import jdk.dynalink.linker.GuardedInvocationTransformer;

public class Checkalphabetornot {
    public static void main(String args[])
    {
        char given='P';
        if ((given>='a'&& given<='z')||(given>='A'&&given<='Z')) 
        {
            System.out.println("the character " +given+  " is an alphabet");
            
        } else 
        {
            System.out.println("The character " +given+ " is not an alphabet");
        }
    }
    
}

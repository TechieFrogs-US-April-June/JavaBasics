package src.Assignments;



public class CharacterFromAtoZLoop {
    
    public static void main(String[] args) {
         //printing UPPERCASE Alphabets
         for(char ch='A';ch<='Z';ch++)
         {
             System.out.print("UPPERCASE Alphabets : " + ch + "\n");
            
         }
         //printing LOWERCASE Alphabets
         System.out.print("---------------------- " + "\n" );
         for(char ch='a';ch<='z';ch++)
         {
            
            System.out.print("LOWERCASE Alphabets : " + ch + "\n");
         }
    }
    
}
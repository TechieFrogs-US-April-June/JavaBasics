package src.Assignments;

//Q7:  Check Whether a Character is Alphabet or Not

public class CheckWhetherACharacterIsAlphabetOrNot {
    public static void main(String[] args) {
       
        char Alphabet = 'M';
        
        if (Alphabet >= 'a' && Alphabet<= 'z')
        {
            System.out.println("Character is Lower Alphabet");
        }

        else if(Alphabet >= 'A' && Alphabet<= 'Z')
        {
            System.out.println("Character is Upper Alphabet");
        }
        else{
            System.out.println("Character is not Alphabet");
        }

    }
    
}

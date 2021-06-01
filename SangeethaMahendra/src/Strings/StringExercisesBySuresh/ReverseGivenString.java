package src.Strings.StringExercisesBySuresh;

//HOW TO REVERSE GIVEN STRING
public class ReverseGivenString {
    public static void main(String[] args) {
        String s = new String("Sangeetha");
        char[] ch = s.toCharArray();
        String temp = "" ; 
        for(int i=ch.length-1;i>=0;i--)
        {
            temp = temp+ch[i];
        }
        System.out.println(temp);


    }
    
}
